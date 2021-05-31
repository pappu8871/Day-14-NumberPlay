package com.classpractice.numberplay;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberPlayUC2 {

	     public static void main(String[] args) {
		//  Use collection
			List<Integer>myNumberList = new ArrayList<Integer>();
			    for(int i = 0; i<5; i++) myNumberList.add(i);
			
			    //Apply operation on the Stream
			    Function<Integer,Double> toDoubleFunction = Integer::doubleValue;
			    List<Double>streamList = (List<Double>) myNumberList.stream()
			    		                 .map(toDoubleFunction)
			    		                 .collect(Collectors.toList());
			    	System.out.println("Stream Print Double List " + streamList);
			   }
}
