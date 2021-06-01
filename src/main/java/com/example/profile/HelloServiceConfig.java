package com.example.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloServiceConfig {

	// 참고 url : http://wonwoo.ml/index.php/post/1933

	// 방법 1)
	// @Configuration
	// @Profile("default")
	// static class DefaultHelloConfig {
	// 	@Bean
	// 	HelloService helloService() {
	// 		return new DefaultHelloService();
	// 	}
	// }
	//
	// @Configuration
	// @Profile({"dev", "prod"})
	// static class DevHelloConfig {
	// 	@Bean
	// 	HelloService helloService() {
	// 		return new WorldHelloService();
	// 	}
	// }

	// 방법 2)
	@Bean
	@Profile("default")
	HelloService defaultHelloService() {
		return new DefaultHelloService();
	}

	@Bean
	@Profile({"dev", "prod"})
	HelloService worldHelloService() {
		return new WorldHelloService();
	}

	// dev 환경이 아닌 경우에만 빈 설정 방법
	// @Bean
	// @Profile("!dev")
	// HelloService defaultHelloService() {
	// 	return new DefaultHelloService();
	// }
}
