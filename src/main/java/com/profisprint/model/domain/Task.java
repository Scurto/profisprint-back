package com.profisprint.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
@Data
public class Task {

    @Id
    @Column(name = "pk_task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pkTaskId;

    @Column(name = "order_task_id")
    private String orderTaskId;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "advertises")
    private String advertises;

    @Column(name = "videos")
    private String videos;

    @Column(name = "domain")
    private String domain;
}
