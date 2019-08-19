package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfNO {
	private static SumOfNO sum = null;
	private static SumOfNO obj = null;

	SumOfNO() {
		/*
		 * Private Constructor will prevent the instantiation of this class directly
		 */
	}

	public static SumOfNO objectCreationMethod() {
		/*
		 * This logic will ensure that no more than one object can be created at a time
		 */
		if (obj == null) {
			obj = new SumOfNO();
		}
		return obj;
	}


	public static void test(String s) {
		System.out.println("string");

	}

	public static void test(Object oj) {
		System.out.println("Object");

	}
	

	public static void main(String[] args) {
		SumOfNO.test(null);

		// TODO Auto-generated method stub
		SumOfNO s1 = new SumOfNO();
		ArrayList<Integer> al = new ArrayList<>();
		Arrays.asList(1, 2, 3);
		al.add(1);

		al.add(5);

		al.add(3);
		al.add(3);
		int s = 0;
		al.stream().distinct().forEach(System.out::print);
	List<Integer> d=	al.stream().distinct().collect(Collectors.toList());
	System.out.println(d);

	}
}
