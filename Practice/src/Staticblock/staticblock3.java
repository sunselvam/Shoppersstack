package Staticblock;

public class staticblock3 {
	static int a=10;
	static {
		int a=20;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println(a);
	}

}
