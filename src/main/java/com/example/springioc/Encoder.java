package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component
public class Encoder {

	private IEncoder iEncoder;	// DI

	// public Encoder(@Qualifier("base74Encoder") IEncoder iEncoder) {
	// 	this.iEncoder = iEncoder;
	// }

	public Encoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}

	public void setiEncoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}

	public String encode(String message) {
		return iEncoder.encode(message);
	}
}
