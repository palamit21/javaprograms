package com.java.test;

import javax.annotation.Generated;


public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", single=" + single + "]";
	}
	private String name;
    private int age;
    private SingletonEnum single;
	public SingletonEnum getSingle() {
		return single;
	}
	public void setSingle(SingletonEnum single) {
		this.single = single;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public void displayValue(String s) {
		System.out.println("hello   "+s);
		
	}
	

}
