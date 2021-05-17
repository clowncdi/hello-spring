package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.hello.dto.User1;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("------------------");

		// Object Mapper
		// Text JSON -> Object
		// Object -> Text JSON

		// controller req json(text) -> object
		// response object -> json(text)

		var objectMapper = new ObjectMapper();

		// object -> text
		// object mapper get method 를 활용한다. object mapper를 이용할 땐 클래스 내부 메서드명에 get을 사용하면 안된다.
		var user = new User1("steve", 10, "010-1111-2222");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		// text -> object
		// object mapper 는 default 생성자를 필요로 한다.
		var objectUser = objectMapper.readValue(text, User1.class);
		System.out.println(objectUser);
	}

}
