package com.example.hello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.dto.PutRequestDto;

@RestController
@RequestMapping("/api")
public class PutApiController {

	@PutMapping("/put/{userId}")
	public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(name = "userId") Long id) {
		System.out.println(id);
		return putRequestDto;
	}
}
