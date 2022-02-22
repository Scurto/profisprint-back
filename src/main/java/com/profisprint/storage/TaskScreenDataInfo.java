package com.profisprint.storage;

import com.profisprint.model.screenTask.DataScreenTaskDto;
import com.profisprint.model.screenTask.FixedScreenUrlDto;
import com.profisprint.model.simpleTask.DataTaskDto;

import java.util.List;
import java.util.Optional;

public class TaskScreenDataInfo {

    public static DataScreenTaskDto getTaskData(String taskId) {
        Optional<DataScreenTaskDto> task = taskDataList().stream().filter(o -> o.getTaskId().equals(taskId)).findFirst();
        return task.get();
    }


    public static List<DataScreenTaskDto> taskDataList() {
        List<DataScreenTaskDto> taskList = List.of(
            new DataScreenTaskDto(
                    "0",
                    "someChannelId",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "test",
                    null

            ),
            new DataScreenTaskDto(
                    "1",
                    "UCJIbnmV8DdqOGEcl6hm-x8w",
                    "12345-test",
                    "1",
                    "1",
                    "1",
                    "1",
                    "1",
                    "myTest",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "gamevvtv", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "vmgametv", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2",
                    "UCJIbnmV8DdqOGEcl6hm-x8w",
                    "12345-test",
                    "3",
                    "2",
                    "2",
                    "60",
                    "30",
                    "myTest",
                    null
            ),
            new DataScreenTaskDto(
                    "2634924",
                    "UCEUjUp43XOOI2iphTpO3HBQ",
                    "vas",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "gamevvtv", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "vmgametv", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2634926",
                    "UCJSCW_8gFQ87KMibxuQMukg",
                    "vas",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "vnf", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "vmnfoot", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2149241",
                    "UCZ4HpE01pjMM7_NGRxxuf7A",
                    "12737640",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "Time Lapse", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "WoW Time Lapse", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2259286",
                    "UCy2Wks9wESs0l2Ew1X0XZ0g",
                    "12737640",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "ПРИРОДА", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "WOW nature seasons - YouTube", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2552364",
                    "UC3vecH27wliyvSsUEWNwjVA",
                    "12737640",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "WHARM TV", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "Warmth tv - YouTube", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2253041",
                    "UCTbYHCqM8tTR1FPAhr6X1aQ",
                    "7607850",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "Один на один с природой", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "Один на один с плейлистом - YouTube", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2662182",
                    "UC-7f_29nxKco3b5SL8i7Ggw",
                    "7607850",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "Футбольный Мэн", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "Подборка видео 1 - YouTube", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2253038",
                    "UC4Fux0APdot1vdq9Ar6xjhQ",
                    "7607850",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "Природе быть!", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "Природе быть! - YouTube", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2564378",
                    "UCOMMjXqGgXqQt6fpVKRhQSQ",
                    "7607850",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "Кто куда, а я путешествовать", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "Кто куда, а я путешествовать! - YouTube", "youtube")
                    )
            ),
                new DataScreenTaskDto(
                        "2589972",
                        "UCOMMjXqGgXqQt6fpVKRhQSQ",
                        "7607850",
                        "3",
                        "0",
                        "0",
                        "80",
                        "0",
                        "seosprint",
                        List.of(
                                new FixedScreenUrlDto("vk.com", "Когда камера в руках", "vk"),
                                new FixedScreenUrlDto("www.youtube.com", "Самые интересные - YouTube", "youtube")
                        )
                ),
            new DataScreenTaskDto(
                    "2682526",
                    "list=PLbNPZpTZ1W4sfZUnerNhHGKdH04FC1Ii5",
                    "Julia",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "We flight", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "Аэросъемка с помощью квадрокоптера - YouTube", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2682518",
                    "list=PLRvQ0gICpXLeTTucRF_bA-iTTeT557PRx",
                    "Julia",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "Worldwide", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "море - YouTube", "youtube")
                    )
            ),
                new DataScreenTaskDto(
                        "2682523",
                        "list=PLKJpyrHCmkpUc8qMZ8kmEq4WX3wQBJI6y",
                        "Julia",
                        "3",
                        "0",
                        "0",
                        "80",
                        "0",
                        "seosprint",
                        List.of(
                                new FixedScreenUrlDto("vk.com", "the first", "vk"),
                                new FixedScreenUrlDto("www.youtube.com", "чистый воздух - YouTube", "youtube")
                        )
                ),
            new DataScreenTaskDto(
                    "2564590",
                    "UCwCCkv-d2QxKrFzahjU9Fjw",
                    "13548497",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "Александр Герасимов", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "NaturalisT Александр Герасимов - YouTube", "youtube")
                    )
            ),
            new DataScreenTaskDto(
                    "2646107",
                    "UCiCnifYLOJ_x-XvxluPuhzg",
                    "orfen",
                    "3",
                    "0",
                    "0",
                    "80",
                    "0",
                    "seosprint",
                    List.of(
                            new FixedScreenUrlDto("vk.com", "DSU", "vk"),
                            new FixedScreenUrlDto("www.youtube.com", "DSU - YouTube", "youtube")
                    )
            ),
                new DataScreenTaskDto(
                        "2646106",
                        "UCDc98TeeN_Xbwzxv0gL6oLQ",
                        "orfen",
                        "3",
                        "0",
                        "0",
                        "80",
                        "0",
                        "seosprint",
                        List.of(
                                new FixedScreenUrlDto("vk.com", "DotA 2", "vk"),
                                new FixedScreenUrlDto("www.youtube.com", "DotA 2 - YouTube", "youtube")
                        )
                )
        );

        return taskList;
    }
}
