package com.classpractice.numberplay;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberPlayUC1 {
	  public static void main(String[] args) {
		//  Use collection
			List<Integer>myNumberList = new ArrayList<Integer>();
			    for(int i = 0; i<5; i++) myNumberList.add(i);
			
			//Implicit Lambda Function to check even
			    
			    myNumberList.stream().forEach(n -> {
			    	System.out.println("Stream for each value " +n);
			    });
			    
			}

}
