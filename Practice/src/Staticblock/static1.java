package Staticblock;

public class static1 {
	int a=10;
	static static1 a1=new static1() ;
	static{
		a1.a=40;
		
	}
public static void main(String[] args) {
	System.out.println(a1.a);
}
}
