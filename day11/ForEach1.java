package day11;

import java.util.Arrays;
import java.util.List;

public class ForEach1 { // the for each internally implements the functional interface

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(number -> System.out.println(number));

	}
}
