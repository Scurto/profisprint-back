package com.profisprint.model.youtube;

import lombok.Data;

@Data
public class Item {
    private String kind;
    private String etag;
    private ItemModelId id;
    private Snippet snippet;
}
