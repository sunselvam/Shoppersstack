package Sample;

public class sixth {
	static int a=10;
	       int b=20;
	       int c=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sixth a1=new sixth();
		a1.a= 70;
		a1.b= 80;
		a1.c= 90;
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		sixth a2=new sixth();
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a2.c);
        a2.a=1001;
        System.out.println(a1.a);
        System.out.println(sixth.a);
        System.out.println(a);
	}

}
