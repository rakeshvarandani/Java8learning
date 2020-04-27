package java8;

import java.util.*;
import java.util.stream.Collectors;

public class LamdaP {

	public static void main(String[] args) {
		
		List<String> lis = new ArrayList<>();
		
		lis.add("hello");
		lis.add("RV");
		lis.add("MV");
		
		lis.forEach(l-> System.out.println(l));
		
		List<String> lo;
		
		
		//here we are filtering the list with value RV
		 lis.stream()    //  ......................    ...source
					.filter(l->l.equals("RV")) // .......intermidiate operation
										
					.forEach(l->System.out.println(l));//  ....terminal operation
		
		 //here we are counting the number of elements in stream
		long cou = lis.stream()
		 		.count();
		
		System.out.println("count is "+ cou );
		
		
		//here we are collecting stream into our list after mapping it to different value
		// we are doing this by appending ?????? to string using map method
		lo = lis.stream()
				.map(l->l+"????????????")
				.collect(Collectors.toList());
		
		lo.forEach(l-> System.out.println(l));
	}

}
