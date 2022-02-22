package com.profisprint.model.screenTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FetchScreenTaskResponse {
    private List<NavObjectDto> navList;
    private List<ResultObjectDto> resultList;
    private DateObjectDto date;
    private String lastUsedVideos;
}
