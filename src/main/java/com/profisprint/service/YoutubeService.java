package com.profisprint.service;

import java.util.List;

public interface YoutubeService {

    List<String> getVideosByChannelId(String channelId);
    List<String> getVideosByCount(List<String> videos, String countOfVideo);
    List<String> getVideosByChannelIdAndCount(String channelId, String countOfVideo);
    List<String> getVideosByChannelIdAndCountWithFilterByLastUsedVideo(String channelId, String countOfVideo, String lastUsedVideos);
    List<String> getVideosAlternativeByChannelId(String channelId);
}
