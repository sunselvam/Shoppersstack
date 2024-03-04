package inheritance;

public class B extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		System.out.println(b1.a);//0
		System.out.println(b1.b);//0
		System.out.println(b1.c);//0
		System.out.println(b1.d);//0
		System.out.println(B.d);//0
		System.out.println(d);//0
	
	}

}
