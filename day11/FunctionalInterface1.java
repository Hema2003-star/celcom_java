package day11;

@FunctionalInterface
interface MyInterface {
	int calc (int a, int b);  //public and abstract
}
 /*
//With out lambda expression
class Addition implements MyInterface {

	@Override
	public int calc(int a, int b) {
		return a + b ;
		
	}
	
}


class Subtraction implements MyInterface {

	@Override
	public int calc(int a, int b) {
		return a - b ;
		
	}
	
}
*/
public class FunctionalInterface1 {
	
	public static void main(String[] args) {
		MyInterface ref = (a, b) -> a+b ;
		System.out.println(ref.calc(10, 20));
		System.out.println(ref.calc(30, 40));
		
		ref = (a, b) -> a-b ;
		System.out.println(ref.calc(10, 20));
		
	}
	

}
