package com.profisprint.model.screenTask;

import lombok.Data;

import java.util.List;


@Data
public class FetchScreenTaskResponse {
    private List<NavObjectDto> navList;
    private List<ResultObjectDto> resultList;
}
