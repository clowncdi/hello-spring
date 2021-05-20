package com.example.validation.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
	@NotBlank
	private String name;
	@NotBlank
	@JsonProperty("car_number")
	private String carNumber;
	@NotBlank
	@JsonProperty("TYPE")
	private String type;
}
