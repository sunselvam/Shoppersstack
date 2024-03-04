package methods;

public class method1 {
	public static void sum(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
   public static void main(String[] args) {
	   sum(10,20);
	   method1.sum(30, 40);
	   method1 m2=new method1();
	   m2.sum(70, 80);
	
}
}
