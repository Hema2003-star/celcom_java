package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 4, 3, 2, 1);

		// filter() - intermediate operation
		// forEach() - termination operation
		numbers.stream().filter(x -> x % 2 == 0).forEach((System.out::println)); // -> function defnition

		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println("The count of even numbers" + count);

		// collect the elements into the list
		List<Integer> evenNumber = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("The list of even numbers" + evenNumber);

		// collect the elements into the set
		Set<Integer> oddNumber = numbers.stream().filter(x -> x % 2 == 1).collect(Collectors.toSet());
		System.out.println("The list of odd numbers" + oddNumber);

		// collect even and multiply with 10
		List<Integer> multiply = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

		System.out.println("The multiplication of even numbers" + multiply);
		
		
		List<Integer> sort = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).sorted().collect(Collectors.toList());

		System.out.println("The multiplication of even numbers" + sort);

	}
}
