package day11;

public interface InterfaceJava8 {

	void myAbstractMethod();

	default void myDefaultMethod() {
		System.out.println("defaut abstract");
	}

	static void myStaticMethod() {
		System.out.println("static abstract");
	}

	class A implements InterfaceJava8 {
		public void myDefaultMethod() {
			System.out.println(" overridden default method");
		}

		@Override
		public void myAbstractMethod() {
			System.out.println("abstract method");
		}

	}

	class B {
		public static void main(String[] args) {
			A obj = new A();
			obj.myDefaultMethod();

		}
	}

}
