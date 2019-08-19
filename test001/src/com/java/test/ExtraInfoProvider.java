package com.java.test;
@FunctionalInterface
public interface ExtraInfoProvider<R> {
	
	R provideMore(R r);

}
