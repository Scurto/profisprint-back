package com.profisprint.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.TimerTask;

@Component
public class MyTask implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println("FROM MY TASK BEFORE SLEEP> " + new Date());
            Thread.sleep(5000);
            System.out.println("FROM MY TASK AFTER SLEEP> " + new Date());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
