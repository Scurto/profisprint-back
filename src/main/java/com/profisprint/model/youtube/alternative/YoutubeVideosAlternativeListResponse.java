package com.profisprint.model.youtube.alternative;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeVideosAlternativeListResponse {

    private Object responseContext;
    private ContentsMain contents;
    private Object header;
    private Object metadata;
    private Object trackingParams;
    private Object topbar;
    private Object microformat;
}
