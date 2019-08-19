package com.java.test;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class LocalUtils {
	
	public static <I, O> void optionalMap(final I from, final Consumer<O> to, final Function<I, O> convert ){
		Optional.ofNullable(from).map(convert).ifPresent(to);	
		}

	public static void optionalMap(Object from, Object to, Object convert) {
		// TODO Auto-generated method stub
		
	}
	
		
	}


