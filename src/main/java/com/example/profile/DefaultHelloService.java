package com.example.profile;

public class DefaultHelloService implements HelloService {

	@Override
	public String hello(String name) {
		return "hello " + name;
	}
}
