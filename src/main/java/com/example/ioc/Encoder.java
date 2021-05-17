package com.example.ioc;

public class Encoder {

	private IEncoder iEncoder;	// DI

	public Encoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}

	public String encode(String message) {
		return iEncoder.encode(message);
	}
}
