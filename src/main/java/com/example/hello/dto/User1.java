package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User1 {
	private String name;
	private Integer age;

	@JsonProperty("phone_number")
	private String phoneNumber;

	public User1 defaultUser() {
		return new User1("default", 0, "010-1111-2222");
	}
}
