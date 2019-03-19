package com.city.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @ClassName  TimingTask 
 * @Description TODO
 * @author 梁城市
 * @date  2019年3月19日 下午2:09:33 
 *
 */
@EnableScheduling
@SpringBootApplication
public class TimingTask extends SpringBootServletInitializer {
	public static void main(String[] args) {
        SpringApplication.run(TimingTask.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TimingTask.class);
	}
}
