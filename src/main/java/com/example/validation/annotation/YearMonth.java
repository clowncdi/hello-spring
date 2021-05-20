package com.example.validation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.example.validation.validator.YearMonthValidator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Constraint(validatedBy = {YearMonthValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface YearMonth {
	String message() default "yyyyMM 형식에 맞지 않습니다.";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	String pattern() default "yyyyMMdd";
}
