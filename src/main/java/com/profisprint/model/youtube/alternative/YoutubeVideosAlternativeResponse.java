package com.profisprint.model.youtube.alternative;

import lombok.Data;

import java.util.List;

@Data
public class YoutubeVideosAlternativeResponse {

    private Object responseContext;
    private ContentsMain contents;
    private Object header;
    private Object metadata;
    private Object trackingParams;
    private Object topbar;
    private Object microformat;
}
