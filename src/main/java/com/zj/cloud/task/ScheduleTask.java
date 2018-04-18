package com.zj.cloud.task;

import org.quartz.JobExecutionContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * 调度的任务。
 *
 * testScheduleTask 字符串名称在 quartz.xml 中配置为属性 targetObject 的 value 值。
 * sayHello 方法名称在 quartz.xml 中配置为属性 targetMethod 的 value 值。
 *
 * @author zj
 *
 */
@Configuration
@Component("testScheduleTask")
@EnableScheduling
public class ScheduleTask {
    private static final Logger Logger = LoggerFactory.getLogger(ScheduleTask.class);

    public void sayHello(JobExecutionContext context){
        Logger.info("====    sayHello 123456789 to log   ====");
        System.out.println("====   调用了sayHello()方法    ====");
    }

}
