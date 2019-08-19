package com.java.test;

import java.util.function.Supplier;

public class NotFoundException implements Supplier {
	
	private String value;

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public NotFoundException(String value) {
		super();
		this.value = value;
	}

}
