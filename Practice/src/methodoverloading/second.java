package methodoverloading;

public class second {
	public static void method(int a) {
		System.out.println("appu");
	}
public static void method(int a, int b) {
	System.out.println(a);
}
public static void main(String[] args) {
	method(6,10);
	method (5);
	
}
}
