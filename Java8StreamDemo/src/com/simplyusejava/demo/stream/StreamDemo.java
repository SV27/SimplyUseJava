package com.simplyusejava.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		// initializing a List of Integer
		
		List<Integer> numbers = new ArrayList<>(); 
		
		for(int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
		
		// Implement stream the List,   Elements of Stream pipeline with sum
		
		int sofNum = numbers.stream() // source
						.mapToInt(i -> i) // intermidate step
						.sum(); // terminal step.
		
		System.out.println(sofNum);
		
		// implement parallel Stream
		
		int sofNumP = numbers.parallelStream()// source
				.mapToInt(i -> i) // intermidate step
				.sum(); // terminal step.

		System.out.println(sofNumP);
		
		// using filter, reduce to find the sum
		
		int sOfNusingFiler = numbers.stream()
								.filter(i -> i<=5)
								.reduce(0, Integer::sum);
		
		System.out.println(sOfNusingFiler);
		
		// using map, concatenate with "|"
		
		String s = numbers.stream().map(o -> String.valueOf(o)).collect(Collectors.joining("|"));
		
		System.out.println(s);
		
		// concurrent modification -> Lazy loading
		
		Stream<Integer> s1 = numbers.stream();
		
		numbers.add(1);
		
		int s_1 = s1.reduce(0, Integer::sum);
		
		System.out.println(s_1);
		
		
		// require non-null sources
		
		numbers.add(null); // it will thorw nullpointer exception. 
		int sofNum2 = numbers.stream() // source
				.mapToInt(i -> i) // intermidate step
				.sum(); // terminal step.
		
		// Restrictions with state-full sources
		
	}

}
