package com.java.test;

import java.util.Objects;

@FunctionalInterface
public interface InfoProvider<T, R> {
	
	R provide(T t);
	
	default InfoProvider<T, R> addMore(ExtraInfoProvider<R> more) {
		
		  return (T t) -> {
			 Objects.requireNonNull(more); 
			 R r = provide(t);
			 return more.provideMore(r);
		  };
		  
	  }
	  
	  default DataCombiner<T> addCombiner(DataCombiner<R> combiner) {
		  
		  return (T t) -> {
			  Objects.requireNonNull(combiner);
			  return combiner.combine(provide(t));
		  };
		  
	  }
	

}
