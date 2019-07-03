package com.example.demo.tool;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/6/27.
 */
@Component
public class Scheduler {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    //每隔2秒执行一次
    @Scheduled(fixedRate = 2000)
    public void testTasks(){
        System.out.println("定时任务执行时间:" + DATE_FORMAT.format(new Date()));
    }

    //每天19点45执行
    @Scheduled(cron = "0 49 19 ? * *")
    public void testTasks2() {
        System.out.println("每天定时任务执行时间:" + DATE_FORMAT.format(new Date()));
    }
}
