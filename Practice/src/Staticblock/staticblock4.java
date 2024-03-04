package Staticblock;

public class staticblock4 {
	static int a=10;
	static {
		int a=20;//local variable
		a=30;//reinitializing local variable
		staticblock4.a=60;//reinitializing global variable
	}
	public static void main(String[] args) {
		System.out.println(a);
	}

}
