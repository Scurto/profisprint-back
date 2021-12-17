package com.profisprint.service;

import com.profisprint.model.youtube.alternative.YoutubeVideoObject;

import java.util.List;

public interface YoutubeService {

    List<String> getVideosByChannelId(String channelId);
    List<String> getVideosByCount(List<String> videos, String countOfVideo);
    List<String> getVideosByChannelIdAndCount(String channelId, String countOfVideo);
    List<String> getVideosByChannelIdAndCountWithFilterByLastUsedVideo(String taskId, String channelId, String countOfVideo, String lastUsedVideos);
    List<String> getVideosByChannelIdAndCountWithFilterByLastUsedVideo(String taskId, String channelId, String countOfVideo, List<String> lastUsedVideos);
    List<String> getVideosAlternativeByChannelId(String taskId, String channelId);

    List<YoutubeVideoObject> getVideosObjectByCount(List<YoutubeVideoObject> videos, String countOfVideo);
    List<YoutubeVideoObject> getVideosObjectByChannelIdAndCountWithFilterByLastUsedVideo(String taskId, String channelId, String countOfVideo, List<String> lastUsedVideos);
    List<YoutubeVideoObject> getVideosObjectAlternativeByChannelId(String taskId, String channelId);
}
