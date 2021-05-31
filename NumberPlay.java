package com.classpractice.numberplay;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberPlayUC8 {
	 public static void main(String[] args){
			
	       // Use collection
 List<Integer>myNumberList = new ArrayList<Integer>();
 for(int i = 0; i<5; i++) myNumberList.add(i);
				
//Apply operation on the Stream
//check atlist one Even number and allEven Number

 Predicate<Integer> isEvenFunction = n -> n > 0 && n%2 == 0 ;
boolean allEven = myNumberList.stream().allMatch(isEvenFunction);
 boolean oneEven = myNumberList.stream().anyMatch(isEvenFunction);
 System.out.println("allEven: " +allEven);
 System.out.println("oneEven: " +oneEven);

	 }
}
