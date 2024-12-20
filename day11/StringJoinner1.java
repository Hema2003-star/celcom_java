package day11;

import java.util.StringJoiner;

public class StringJoinner1 {
	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(",");

		joiner.add("one");
		joiner.add("Two");
		joiner.add("Three");
		String result = joiner.toString();

		System.out.println(result);

		StringJoiner joiner1 = new StringJoiner(",", "[", "]");

		joiner1.add("one");
		joiner1.add("Two");
		joiner1.add("Three");
		String result1 = joiner1.toString();

		System.out.println(result1);

	}

}
