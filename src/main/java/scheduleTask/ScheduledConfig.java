package scheduleTask;
//package com.huntto.hii.batch.scheduleTask;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//
///**
// * 
// * @ClassName  ScheduledConfig 
// * @Description 定时任务并行执行
// * @author 梁城市
// * @date  2019年3月28日 上午11:23:39
// */
//@Configuration
//public class ScheduledConfig implements SchedulingConfigurer {
//	@Override
//	public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//	    scheduledTaskRegistrar.setScheduler(setTaskExecutors());
//	}
//
//	@Bean(destroyMethod="shutdown")
//	public Executor setTaskExecutors(){
//	    return Executors.newScheduledThreadPool(3); // 3个线程来处理。
//	}
//}
