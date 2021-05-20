package com.example.async.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.async.service.AsyncService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

	private final AsyncService asyncService;

	@GetMapping("/hello")
	public CompletableFuture hello() {
		log.info("completable future init");
		return asyncService.run();
	}
}
