package com.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {

		return "Employee[id=" + id + ",name =" + name + ",salary=" + salary + "]";
	}
}

public class Java8AdditionalPractice {

	public static void main(String[] args) {

		// 1. print the even numbers
		List<Integer> numbers = Arrays.asList(1, 5, 8, 2, 9, 11, 12, 1, 4, 5, 2);
		System.out.println("The even numbers");
		List<Integer> list = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list);

		// 2.find out all te numbers start with 1

		List<Integer> list1 = numbers.stream().filter(x -> String.valueOf(x).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("");
		System.out.println("The number start with 1");
		System.out.println(list1);

		// 3. duplicate elements

		Set<Integer> set = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x))
				.collect(Collectors.toSet());
		System.out.println("The duplicate elements using set ");
		System.out.println(set);

		// or
		List<Integer> lists = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x)).distinct()
				.collect(Collectors.toList());
		System.out.println("The duplicate using distinct");
		System.out.println(lists);

		// the count of duplicate
		// count() method return type is long
		long count = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x)).distinct().count();
		System.out.println("The duplicate count ");
		System.out.println(count);

		// 4. find the first element of list
		int first = numbers.stream().findFirst().get();
		System.out.println("The first element of list is");
		System.out.println(first);

		// 5. Total number of elements
		long counts = numbers.stream().count();
		System.out.println("The Total Count");
		System.out.println(counts);

		// 6. maximum value present
		int max = numbers.stream().max((x, y) -> x - y).get();
		System.out.println("The maximum count is :");
		System.out.println(max);

		// 7. sort the elements
		List<Employee> empList = Arrays.asList(new Employee(101, "valan", 3000),
				new Employee(102, "lakshmipathi", 2000), new Employee(103, "priya", 4000));
		List<Employee> sortList = empList.stream().sorted((e1, e2) -> e1.salary - e2.salary)
				.collect(Collectors.toList());
		System.out.println(sortList);

		// 8. sort in ascending
		List<Integer> sortList1 = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("The ascending order");
		System.out.println(sortList1);

		// 9. sort all the values descending
		List<Integer> ascSort = numbers.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println("The decending sort");
		System.out.println(ascSort);

		// 10.Given an integer array nums, return true if any value appears at least
		// twice in the array,
		// and return false if every element is distinct.

		Set<Integer> tempSet = new HashSet<>();
		boolean flag = numbers.stream().filter(x -> tempSet.add(x) == false).count() > 0 ? true : false;
		System.out.println("The result ");
		System.out.println(flag);

		// 11.Java 8 program to find factorial of given list of integer values

		List<Integer> lists1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> factList = lists1.stream().map(x -> {
			int fact = 1;
			for (int i = 1; i <= x; i++)
				fact = fact * i;
			return fact;
		}).collect(Collectors.toList());

		System.out.println(factList);

		// 12.Write a Java 8 program to sort an array and then convert the sorted array
		// into Stream?

		int arr[] = { 3, 5, 2, 1, 7 };
		Arrays.sort(arr);
		System.out.println("The sorted array");
		Arrays.stream(arr).forEach(System.out::println);

		// 13. Convert a List of String into upper case using stream
		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");
		List<String> upperList = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperList);

		// 14. Convert a List of String into a Map key and it's length as Map Value
		// using Java 8 Stream
		Map<String, Integer> map = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println(map);

		// 15.flatMap
		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 7, 9);

		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		System.out.println("Before Flattering");
		System.out.println(evenOdd);

		List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result);

		// 16.consumer
		Consumer<String> consumer = str -> System.out.println(str);
		strList.forEach(consumer);

		Consumer<Integer> evenConsumer = n -> {
			if (n % 2 == 0)
				System.out.println(n);
		};
		list.forEach(evenConsumer);

		// 17.predict
		Predicate<String> predict = str -> str.contains("p");
		strList.stream().filter(predict).forEach(System.out::println);

		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		list.stream().filter(evenPredicate).forEach(System.out::println);

		// 18.Function
		Function<String, Character> function = str -> str.charAt(0);
		strList.stream().map(function).forEach(System.out::println);

		Function<Integer, String> function1 = n -> {
			if (n % 2 == 0)
				return "Even";
			else

				return "Odd";
		};
		list.stream().map(function1).forEach(System.out::println);
		;

		Supplier<String[]> supplier = () -> new String[] { "One", "Two", "Three" };
		Arrays.asList(supplier.get()).forEach(System.out::println);

		Predicate<String> myPredicate = str -> str.contains("o") || str.contains("O");
		Function<String, Character> myFunction = str -> str.charAt(0);
		Consumer<Character> myConsumer = c -> System.out.println(c);

		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);

	}
}
