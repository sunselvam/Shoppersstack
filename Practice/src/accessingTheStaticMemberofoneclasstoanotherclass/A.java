package accessingTheStaticMemberofoneclasstoanotherclass;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B.a=10;
		B a1=new B();
	B.b=20;
		System.out.println(B.a);
		System.out.println(B.b);
		B.method();
		a1.method();

	}

}
