package com.example.profile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;

// @IfProfileValue(name = "java.vendor", value = "Oracle corporation")  //java vendor가 오라클일 경우에만 테스트를 실행
// @IfProfileValue(name="test-groups", values = {"unit", "integration"})
@SpringBootTest
@ActiveProfiles("dev")
public class SpringProfilesTest {

	@Autowired
	private HelloService helloService;

	@Test
	public void profilesTest() {
		assertThat(helloService.hello("wonwoo")).isEqualTo("hello world wonwoo!");
		System.out.println(helloService.hello("haha"));
	}
}
