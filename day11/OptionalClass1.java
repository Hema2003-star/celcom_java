package day11;

import java.util.Optional;

public class OptionalClass1 {
	public static void main(String[] args) {
		String name = null;
		Optional<String> nameOptional = Optional.ofNullable(name);

		if (nameOptional.isPresent()) {
			// value is present , you can access it using get();
			String value = nameOptional.get();
		} else {
			System.out.println("Value is Absent");
		}
	}

}
