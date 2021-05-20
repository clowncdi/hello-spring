package com.example.exception.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	String statusCode;
	String requestUrl;
	String code;
	String message;
	String resultCode;

	List<Error> errorList;
}
