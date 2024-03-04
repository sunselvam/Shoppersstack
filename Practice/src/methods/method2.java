package methods;

public class method2 {
	public static void appu(int a, int b, int c)
	{
		int d=a*b*c;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		method2 m2=new method2();
		m2.appu(30, 40, 60);
		method2.appu(2, 3, 10);
		appu(10,2,4);
	}

}
