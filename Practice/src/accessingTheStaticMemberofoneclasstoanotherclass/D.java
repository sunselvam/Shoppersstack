package accessingTheStaticMemberofoneclasstoanotherclass;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C a1=new C();
		a1.a=10;
		a1.b=20;
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.method(10);

	}

}
