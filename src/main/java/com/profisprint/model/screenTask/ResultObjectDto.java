package com.profisprint.model.screenTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultObjectDto {
    private String title;
    private String time;
    private String icon;
    private String text;
    private String url;
}
