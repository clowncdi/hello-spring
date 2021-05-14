package com.example.hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.dto.User;

@RestController  // 해당 Class 는 REST API 처리하는 Controller
@RequestMapping("/api")  // ReqeustMapping URI 를 지정해주는 Annotation
public class ApiController {

	@GetMapping("/hello")	// http://localhost:9090/api/hello
	public String hello() {
		return "hello spring boot!";
	}

	// TEXT
	@GetMapping("/text")
	public String text(@RequestParam String account) {
		return account;
	}

	// JSON
	// request -> object mapper -> object -> method -> object -> object mapper -> json -> response
	@PostMapping("/json")
	public User json(@RequestBody User user) {
		return user;  // 200 OK
	}

	// ResponseEntity
	@PutMapping("/put")
	public ResponseEntity<User> put(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
}
