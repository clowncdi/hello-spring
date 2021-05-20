package com.example.exception.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.dto.User;

@RestController
@RequestMapping("/api/user")
@Validated
public class ApiController {

	@GetMapping("")
	public User get(
			@Size(min = 2)
			@RequestParam String name,

			@NotNull
			@Min(1)
			@RequestParam Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);


		return user;
	}

	@PostMapping("")
	public User post(@Valid @RequestBody User user) {
		System.out.println(user);
		return user;
	}

}
