package casting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		A a1=new A();
		System.out.println(a1.b);
		System.out.println(a1.a);
		a1=c1;//upcasting
	//System.out.println(a1.e);
	//System.out.println(a1.f); CTE
	C c2 =(C)a1;//downcasting
		System.out.println(c2.e);//0
		System.out.println(c2.f);//0
       c2.e=10;
       c2.f=30;
       System.out.println(c2.e);//10
	   System.out.println(c2.f);//30
       B b1;
       b1=new C();
       System.out.println(b1.d);
       //System.out.println(b1.e);CTE because u need to create same data type of that variable
       C c3=(C) b1;
       System.out.println(c3.e);//0 because it will create a new block of memory in heap memory
       System.out.println(c3.f);//0
       System.out.println(c3.b);//0
	}

}
