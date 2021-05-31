package com.classpractice.numberplay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayUC7 {

   public static void main(String[] args){
	
	       // Use collection
   List<Integer>myNumberList = new ArrayList<Integer>();
   for(int i = 0; i<5; i++) myNumberList.add(i);
				
 //Apply operation on the Stream
//Average Value
  Integer sum = myNumberList.stream()
				 .reduce(0, Integer::sum);
				  long count = myNumberList.stream().count();
System.out.println("Average of "+sum+"/"+count+" = "+sum/count);
     }
}
