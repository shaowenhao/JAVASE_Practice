package data.java8.lambda5;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
	 
		/*
		 * String has shili Method (not static) endWith
		 * Want to wirte an class to Fengzhuang above method
		 * 
		 * 
		 * @FunctionalInterface
          public interface Function<T, R> {
		 * R apply(T t);
		 * Note: Input T Output R
		 */
		
		
		// Internal anonymous Class
//		String str= "www.xxx";
//		Function<String,Boolean> function = new Function<String, Boolean>(){
//
//			@Override
//			public Boolean apply(String suffix) {
//				return str.endsWith(suffix);
//			}	
//			
//	};
//     Boolean b1 = function.apply("xxx");
//     System.out.println(b1);
		
		
		// Lambda way
//		String str= "www.xxx";
//		Function<String,Boolean> function1 = suffix -> str.endsWith(suffix);
//				
//        Boolean b1 = function1.apply("xxx");
//        System.out.println(b1);
		
		// Lambda easy way ShiLi Fang Fa Yinyong
		String str= "www.xxx";
		Function<String,Boolean> function2 = str::endsWith;
				
        Boolean b1 = function2.apply("xxx");
        System.out.println(b1);
   }
}