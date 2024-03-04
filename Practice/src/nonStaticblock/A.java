package nonStaticblock;

public class A {
	static {
		System.out.println("hii");
	}
	static {
		System.out.println("hello");
	}
	{
		System.out.println("byee");
	}
	{
		System.out.println("tata");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		System.out.println("main method");
		A a2=new A();

	}

}
