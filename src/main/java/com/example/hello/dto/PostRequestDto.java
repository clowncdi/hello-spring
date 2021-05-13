package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PostRequestDto {

	private String account;
	private String email;
	private String address;
	private String password;

	@JsonProperty("phone_number")  // 특정 변수에 Json 이름을 매칭하기 위해서 @JsonProperty 사용
	private String phoneNumber;  // phone_number

	@JsonProperty("OTP")
	private String OTP;
}
