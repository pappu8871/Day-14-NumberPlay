package com.classpractice.numberplay;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberPlayUC3 {
	 public static void main(String[] args) {
			//  Use collection
				List<Integer>myNumberList = new ArrayList<Integer>();
				    for(int i = 0; i<5; i++) myNumberList.add(i);
				
				    //Apply operation on the Stream
				    Predicate<Integer> isEvenFunction = n -> n > 0 && n%2 == 0 ;
				    Function<Integer,Double> toDoubleFunction = Integer::doubleValue;
				    List<Double>streamList = (List<Double>) myNumberList.stream()
				    		                 .filter(isEvenFunction)
				    		                 .map(toDoubleFunction)
				    		                 .collect(Collectors.toList());
				    	System.out.println("Stream Print Double List " + streamList);
	       //Store the Transformed double value in to a new list			  
	 }
}
