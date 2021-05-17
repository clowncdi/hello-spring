package com.example.ioc;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

		// Base 64 encoding
		Encoder encoder = new Encoder(new UrlEncoder());
		String result = encoder.encode(url);
		System.out.println(result);

	}

}
