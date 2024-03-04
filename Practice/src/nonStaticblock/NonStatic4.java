package nonStaticblock;

public class NonStatic4 {
	static int a=10;
	{
		a=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main methid");
		NonStatic4 a1=new NonStatic4();
		System.out.println(a);

	}

}
