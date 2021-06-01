package com.example.profile;

public class WorldHelloService implements HelloService {
	@Override
	public String hello(String name) {
		return "hello world " + name + "!";
	}
}
