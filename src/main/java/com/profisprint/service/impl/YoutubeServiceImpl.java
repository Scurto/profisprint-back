package com.profisprint.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.profisprint.model.youtube.alternative.GridRender;
import com.profisprint.model.youtube.alternative.YoutubeVideosAlternativeResponse;
import com.profisprint.model.youtube.YoutubeVideosResponse;
import com.profisprint.service.YoutubeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class YoutubeServiceImpl implements YoutubeService {

    private String key = "AIzaSyAyNojjjjdQtfeIajqOXU6n4iQBysBS2kU";
    private String clientSecret = "eqIAfk-lVvuKjf02ILGNtPld";
    private String prefix = "https://www.youtube.com/watch?v=";

    private final RestTemplate restTemplate;

    public YoutubeServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//        ----- get channelId by video id
//        https://youtube.googleapis.com/youtube/v3/videos?part=snippet&id=oFkg4Hwj1S4&key=AIzaSyAyNojjjjdQtfeIajqOXU6n4iQBysBS2kU
//        ------------------------------------

    @Override
    public List<String> getVideosByChannelId(String channelId) {
        String url = new StringBuilder("https://youtube.googleapis.com/youtube/v3/search?part=snippet")
                .append("&channelId=").append(channelId)
                .append("&maxResults=50&order=date&type=video")
                .append("&key=").append(key).toString();

        YoutubeVideosResponse response = restTemplate.getForObject(url, YoutubeVideosResponse.class);
        List<String> videosList = response.getItems().stream().map(item -> item.getId().getVideoId()).collect(Collectors.toList());
        return videosList;
    }

    @Override
    public List<String> getVideosByCount(List<String> videos, String countOfVideo) {
//        return videos.stream().limit(Integer.valueOf(countOfVideo)).map(video -> prefix+video).collect(Collectors.toList());
        return videos.stream().limit(Integer.valueOf(countOfVideo)).collect(Collectors.toList());
    }

    @Override
    public List<String> getVideosByChannelIdAndCount(String channelId, String countOfVideo) {
        List<String> allVideoList = getVideosByChannelId(channelId);
        List<String> countedVideoList = getVideosByCount(allVideoList, countOfVideo);
        return countedVideoList;
    }

    @Override
    public List<String> getVideosByChannelIdAndCountWithFilterByLastUsedVideo(String channelId, String countOfVideo, String lastUsedVideos) {
//        List<String> allVideoList = getVideosByChannelId(channelId);
        List<String> allVideoList = getVideosAlternativeByChannelId(channelId);
        System.out.println("before = " + allVideoList.size());
        if (lastUsedVideos != null) {
            List<String> forRemove = List.of(lastUsedVideos.split("/"));
            allVideoList.removeAll(forRemove);
        }
        System.out.println("after = " + allVideoList.size());
        List<String> countedVideoList = getVideosByCount(allVideoList, countOfVideo);
        return countedVideoList;
    }

    @Override
    public List<String> getVideosAlternativeByChannelId(String channelId) {
        StringBuilder builder = new StringBuilder("https://www.youtube.com/channel/").append(channelId).append("/videos");
        String url = builder.toString();
        List<String> videosList = new ArrayList<>();

        HttpEntity<Void> requestEntity = new HttpEntity<>(new HttpHeaders());
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);

        String a = exchange.getBody().substring(exchange.getBody().indexOf("var ytInitialData = {") +20, exchange.getBody().length());
        String b = a.substring(0, a.indexOf(";</script>"));

        try {
            YoutubeVideosAlternativeResponse response = new ObjectMapper().readValue(b, YoutubeVideosAlternativeResponse.class);
            ArrayList<HashMap<String, HashMap<String, ArrayList>>> list = (ArrayList<HashMap<String, HashMap<String, ArrayList>>>) response.getContents().getTwoColumnBrowseResultsRenderer().getTabs().get(1).getTabRenderer().getContent().get("sectionListRenderer").get("contents");
            HashMap<String, HashMap<String, ArrayList<HashMap<String, Object>>>> map = (HashMap<String, HashMap<String, ArrayList<HashMap<String, Object>>>>) list.get(0).get("itemSectionRenderer").get("contents").get(0);
            ArrayList<HashMap<String, Object>> hashMaps = map.get("gridRenderer").get("items");
            for (HashMap<String, Object> hashMap : hashMaps) {
                HashMap<String, Object> videoRenderer = (HashMap<String, Object>) hashMap.get("gridVideoRenderer");
                if (videoRenderer != null) {
                    String videoId = (String)videoRenderer.get("videoId");
                    videosList.add(videoId);
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return videosList;
    }
}
