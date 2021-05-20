package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ApiController {

	private final RestTemplateService restTemplateService;

	@GetMapping("/hello")
	public UserResponse getHello() {
		return restTemplateService.hello();
	}
}
