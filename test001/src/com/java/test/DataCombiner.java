package com.java.test;
@FunctionalInterface
public interface DataCombiner<T> {
	
	String combine(T t);

}
