package com.example.async.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AppConfig {

	@Bean("async-thread")
	public Executor asyncThread() {
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setMaxPoolSize(100);
		threadPoolTaskExecutor.setCorePoolSize(10);
		threadPoolTaskExecutor.setQueueCapacity(10);
		threadPoolTaskExecutor.setThreadNamePrefix("Async-");
		return threadPoolTaskExecutor;
	}
}
