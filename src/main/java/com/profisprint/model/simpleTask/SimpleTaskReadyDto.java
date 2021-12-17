package com.profisprint.model.simpleTask;

import lombok.Data;

@Data
public class SimpleTaskReadyDto {

    private String taskId;
    private String channelId;
    private String customerId;
    private String date;
    private String domain;
    private String domainUrl;

    public String fetchDomainUrl(String domain, String taskId) {
        switch (domain){
            case "profitcentr": {
                return "https://profitcentr.com/work-task-read?adv=" + taskId;
            }
            case "seo-fast": {
                return "https://seo-fast.ru/work_task?read&adv=" + taskId;
            }
            case "socpublic": {
                return "http://socpublic.com/account/task_view.html?id=" + taskId;
            }
            case "seouniversal": {
                return "https://seouniversal.ru/work-task-read?adv=" + taskId;
            }
            default: return domain;
        }
    }
}
