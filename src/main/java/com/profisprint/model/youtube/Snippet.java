package com.profisprint.model.youtube;

import lombok.Data;

@Data
public class Snippet {
    private String publishedAt;
    private String channelId;
    private String title;
    private String description;
    private String channelTitle;
    private String liveBroadcastContent;
    private String publishTime;
}
