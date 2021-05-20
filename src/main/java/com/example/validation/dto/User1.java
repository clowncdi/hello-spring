package com.example.validation.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.example.validation.annotation.YearMonth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User1 {

	@NotBlank
	private String name;
	@Max(value = 90, message = "나이가 안맞아~~~ 모든 validation은 message를 가지고 있어서 수정할 수 있다.")
	private int age;
	@Email
	private String email;
	@Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
	private String phoneNumber;
	@YearMonth
	private String reqYearMonth; // yyyyMM

	private List<Car> cars;

	// @AssertTrue(message = "yyyyMM 형식에 맞지 않습니다.")
	// public boolean isReqYearMonthValidation() {
	// 	System.out.println("assert true call");
	// 	try {
	// 		LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
	// 	} catch (Exception e) {
	// 		return false;
	// 	}
	// 	return true;
	// }
}
