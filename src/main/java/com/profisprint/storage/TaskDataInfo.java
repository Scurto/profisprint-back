package com.profisprint.storage;

import com.profisprint.model.simpleTask.DataTaskDto;

import java.util.List;
import java.util.Optional;

public class TaskDataInfo {

    public static DataTaskDto getTaskData(String taskId) {
        Optional<DataTaskDto> task = taskDataList().stream().filter(o -> o.getTaskId().equals(taskId)).findFirst();
        return task.get();
    }


    public static List<DataTaskDto> taskDataList() {
        List<DataTaskDto> taskList = List.of(
            new DataTaskDto(
                    "0",
                    "someChannelId",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "test"

            ),
            new DataTaskDto(
                    "1",
                    "UCJIbnmV8DdqOGEcl6hm-x8w",
                    "12345-test",
                    "1",
                    "1",
                    "1",
                    "3",
                    "2",
                    "myTest"
            ),
            new DataTaskDto(
                    "2",
                    "UCJIbnmV8DdqOGEcl6hm-x8w",
                    "12345-test",
                    "3",
                    "0",
                    "0",
                    "120",
                    "0",
                    "test"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=571933*/
                    "571933",
                    "UC4I8ObTn0IkIhRdTBflObJg",
                    "gamersh",
                    "3",
                    "3",
                    "3",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=728651*/
                    "728651",
                    "UC7QysxMhyjN7_Bo7IepPIEA",
                    "gamersh",
                    "3",
                    "3",
                    "3",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=729950*/
                    "729950",
                    "UCfAbkNKEJ-UwgCdKpJnv94w",
                    "gamersh",
                    "3",
                    "3",
                    "3",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=512678*/
                    "512678",
                    "UC4wip9_U3OUnxRio7oUB2bQ",
                    "gamersh",
                    "3",
                    "3",
                    "3",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=446161*/
                    "446161",
                    "UCfAbkNKEJ-UwgCdKpJnv94w",
                    "gamersh",
                    "2",
                    "2",
                    "2",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=732180*/
                    "732180",
                    "UCxAEHSQ0BObkBpW_yh-EtzQ",
                    "lorddracula",
                    "5",
                    "3",
                    "0",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=736758*/
                    "736758",
                    "UCNtj6yVuYDmsNtiJlPBMKQQ",
                    "lorddracula",
                    "3",
                    "3",
                    "0",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=736757*/
                    "736757",
                    "UC1r1Rsn-fhYXE0DLB9Kgiog",
                    "lorddracula",
                    "3",
                    "3",
                    "0",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=857360*/
                    "857360",
                    "UC0WFXYm3-Ewj3EoNB6Rfa3Q",
                    "businesscool",
                    "3",
                    "0",
                    "0",
                    "130",
                    "0",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=766283*/
                    "766283",
                    "UCny_05E_GiK7xVgWw_7Hr1A",
                    "jmp",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=812650*/
                    "812650",
                    "UCDc98TeeN_Xbwzxv0gL6oLQ",
                    "orfen",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=708490*/
                    "708490",
                    "UCiCnifYLOJ_x-XvxluPuhzg",
                    "orfen",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=827958*/
                    "827958",
                    "UCqE9JfJFnmGWjF2NKZ-J5zA",
                    "orfen",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=737872*/
                    "737872",
                    "UCqE9JfJFnmGWjF2NKZ-J5zA",
                    "orfen",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=756646*/
                    "756646",
                    "UCvKBAu0wfYLLziqX5qXIriQ",
                    "granulin",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=759724*/
                    "759724",
                    "UCIIpklXMQQHAINhv59M2qSA",
                    "tiatia",
                    "2",
                    "2",
                    "1",
                    "40",
                    "60",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seosprint.net/read-task/2212290*/
                    "2212290",
                    "UC1r1Rsn-fhYXE0DLB9Kgiog",
                    "Макс",
                    "3",
                    "0",
                    "0",
                    "150",
                    "0",
                    "seosprint"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=730443*/
                    "730443",
                    "UC8z5jS19yDUUoWvaBYDDPZw",
                    "dmitrymoroz",
                    "2",
                    "2",
                    "1",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=741947*/
                    "741947",
                    "UC8a_c95Y5WlTyS6Y_psLtaQ",
                    "dmitrymoroz",
                    "2",
                    "2",
                    "1",
                    "50",
                    "50",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=742764*/
                    "742764",
                    "UC0PbxfbpDHtJWZBALPXshgg",
                    "dmitrymoroz",
                    "2",
                    "2",
                    "1",
                    "50",
                    "50",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=759496*/
                    "759496",
                    "UCvKBAu0wfYLLziqX5qXIriQ",
                    "tholas",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=859530*/
                    "859530",
                    "UCdILTxzi-L4ctzwRfuUu21w",
                    "olegwt",
                    "2",
                    "2",
                    "1",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=781869*/
                    "781869",
                    "UCvBzw5WhD8RKuyYNLJFYiiw",
                    "stigmata2020",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=813889*/
                    "813889",
                    "UCMXeJdz2fDJvZ9kqxAyb1nw",
                    "damavenak",
                    "2",
                    "2",
                    "1",
                    "50",
                    "30",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=829186*/
                    "829186",
                    "UCPcIDkQOBv7EEnHNGs4cQBQ",
                    "deniskastos",
                    "2",
                    "1",
                    "1",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://seouniversal.ru/work-task-read?adv=7605*/
                    "7605",
                    "UCPcIDkQOBv7EEnHNGs4cQBQ",
                    "deniska06061993",
                    "2",
                    "1",
                    "1",
                    "40",
                    "40",
                    "seouniversal"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=521863*/
                    "521863",
                    "UC_dBjpNyO2J3rzldE9koBgw",
                    "nikita4646",
                    "2",
                    "1",
                    "1",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=836636*/
                    "836636",
                    "UC1nBjIK9hBX84uvtz1tbpVg",
                    "ruslankrasavchi",
                    "3",
                    "1",
                    "3",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=852967*/
                    "852967",
                    "UCqv19OBYtU-vcWmUpA1MgUg",
                    "salyart",
                    "3",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=857324*/
                    "857324",
                    "UC_dBjpNyO2J3rzldE9koBgw",
                    "nikita4646",
                    "2",
                    "2",
                    "1",
                    "120",
                    "30",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=687708*/
                    "687708",
                    "UC9bZxOed9KeZX40D5Wd5GRw",
                    "nikita4646",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=825436*/
                    "825436",
                    "UCCplf8TR45VdnfBmAia063w",
                    "lia2016",
                    "2",
                    "1",
                    "2",
                    "40",
                    "30",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=832456*/
                    "832456",
                    "UC00qCChwIDqlTBxO_slCSpA",
                    "dialex2231",
                    "3",
                    "3",
                    "2",
                    "60",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=791788*/
                    "791788",
                    "UCotMc-nkinKVKEn-8knD_6A",
                    "tamerlan2018",
                    "2",
                    "1",
                    "1",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=821519*/
                    "821519",
                    "UC8z5jS19yDUUoWvaBYDDPZw",
                    "ciber",
                    "2",
                    "2",
                    "1",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=842008*/
                    "842008",
                    "UCwiPiCLosZusO7j0oy6sJDw",
                    "mix",
                    "3",
                    "3",
                    "2",
                    "30",
                    "30",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=841900*/
                    "841900",
                    "UC1Y5o60CMIkP9eRxmrOpOyg",
                    "vadya_crystal",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=797522*/
                    "797522",
                    "UCLMJbwWCVx3TmEnIFN3U3ag",
                    "s1ngle0",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=719244*/
                    "719244",
                    "UCkIlKN6cLoAat_OU9cr8R8Q",
                    "skat10",
                    "5",
                    "1",
                    "3",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=845819*/
                    "845819",
                    "UCYgjtqeJLYAglEf9uLh3BrA",
                    "mpu",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
                new DataTaskDto( /*https://seouniversal.ru/work-task-read?adv=7706*/
                        "7706",
                        "UCYgjtqeJLYAglEf9uLh3BrA",
                        "mpu",
                        "2",
                        "1",
                        "2",
                        "40",
                        "40",
                        "seouniversal"
                ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=760507*/
                    "760507",
                    "UCFxmQ4o17SGRevIrQ2Vd7TQ",
                    "mpu",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://profitcentr.com/work-task-read?adv=658912*/
                    "658912",
                    "UCs3i8VAbHE7RMRYSPJa7d_w",
                    "heldon",
                    "1",
                    "1",
                    "3",
                    "40",
                    "40",
                    "profitcentr"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=755841*/
                    "755841",
                    "UCfaliVna1UQ71ZBGyrsXIzQ",
                    "kidskingdom",
                    "3",
                    "1",
                    "2",
                    "40",
                    "40",
                    "seo-fast"
            ),
            new DataTaskDto( /*https://seo-fast.ru/work_task?read&adv=635949*/
                    "635949",
                    "UCRSnosIC2KL5keKI8HJMh0Q",
                    "ilyav",
                    "2",
                    "0",
                    "0",
                    "120",
                    "0",
                    "seo-fast"
            ),
            new DataTaskDto( /*http://socpublic.com/account/task_view.html?id=852454*/
                    "852454",
                    "UCNtj6yVuYDmsNtiJlPBMKQQ",
                    "Cuzin",
                    "3",
                    "3",
                    "0",
                    "40",
                    "40",
                    "socpublic"
            ),
            new DataTaskDto( /*http://socpublic.com/account/task_view.html?id=1108979*/
                    "1108979",
                    "UC7QysxMhyjN7_Bo7IepPIEA",
                    "GamerSh",
                    "2",
                    "2",
                    "2",
                    "40",
                    "40",
                    "socpublic"
            ),
            new DataTaskDto( /*http://socpublic.com/account/task_view.html?id=901332*/
                    "901332",
                    "UC1nBjIK9hBX84uvtz1tbpVg",
                    "Fokys78",
                    "3",
                    "1",
                    "2",
                    "120",
                    "40",
                    "socpublic"
            ),
            new DataTaskDto( /*http://socpublic.com/account/task_view.html?id=981001*/
                    "981001",
                    "UCFxmQ4o17SGRevIrQ2Vd7TQ",
                    "mpu",
                    "2",
                    "1",
                    "2",
                    "40",
                    "40",
                    "socpublic"
            ),
            new DataTaskDto( /*https://socpublic.com/account/task_view.html?id=1209653*/
                    "1209653",
                    "UCPjk2IX9fDUr9JdjrA1D9Dw",
                    "daddyw",
                    "1",
                    "0",
                    "0",
                    "300",
                    "0",
                    "socpublic"
            ),
            new DataTaskDto( /*https://socpublic.com/account/task_view.html?id=1208503*/
                    "1208503",
                    "UCATI99-azwej8Yhyh54W2aA",
                    "kreg25",
                    "3",
                    "0",
                    "0",
                    "120",
                    "0",
                    "socpublic"
            )
        );

        return taskList;
    }
}
