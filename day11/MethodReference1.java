package day11;

@FunctionalInterface
interface MyReference {
	void msg();
}

class MyClass {
	void myInstanceMethod() {
		System.out.println("Example for my instance method");
	}

	static void myStaticMethod() {
		System.out.println("Example for static method reference");
	}

	MyClass() {
		System.out.println("Constructor");
	}
}

public class MethodReference1 {
	public static void main(String[] args) {
		// reference to instance method
		MyClass obj = new MyClass();
		MyReference reference = obj::myInstanceMethod;
		reference.msg();

		// static method
		reference = MyClass::myStaticMethod;
		reference.msg();

		// constructor
		reference = MyClass::new;
		reference.msg();
	}

}
