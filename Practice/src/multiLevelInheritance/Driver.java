package multiLevelInheritance;

class A{
int a=10;
int b=20;
}
class B extends A
{
	int c=30;
}
class C extends B{
	int d=40;
}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        System.out.println(c1.d);
        A a1=new A();
        System.out.println(a1.a);
        System.out.println(a1.b);
        
	}

}
