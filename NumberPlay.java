package com.classpractice.numberplay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayUC6 {
  
	public static void main(String[] args){
	
	// Use collection
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
	                 //Minimum Even number
				    		Integer min =  myNumberList.stream()
				    					.filter(isEvenFunction)
				    					.min((n1,n2) -> n1-n2)
				    					.orElse(null);
 
		    		         System.out.println("peek min Value " + min);		
                 // Maximum Even Number
		    		  Integer max =  myNumberList.stream()
		    				  		.filter(isEvenFunction)
    		                     	.max(Comparator.comparing(Integer::intValue))
    		                     	.orElse(null);

    		             System.out.println("peek max Value " + max);		    		

}
}
