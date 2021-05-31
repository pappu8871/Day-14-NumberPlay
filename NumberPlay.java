package com.classpractice.numberplay;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberPlayUC5 {
	 public static void main(String[] args) {
			//  Use collection
				List<Integer>myNumberList = new ArrayList<Integer>();
				    for(int i = 0; i<5; i++) myNumberList.add(i);
				
				    //Apply operation on the Stream
				    //peek first Even Numbere
				    Predicate<Integer> isEvenFunction = n -> n > 0 && n%2 == 0 ;
				    Function<Integer,Double> toDoubleFunction = Integer::doubleValue;
				    Integer first =  myNumberList.stream()
				    		                .filter(isEvenFunction)
				    		                .peek(n -> System.out.println("peak Even Number" +n))
				    		                .findFirst()
				    		                .orElse(null);
         
				    		System.out.println("peek first Even Value " + first);
	        }
}
