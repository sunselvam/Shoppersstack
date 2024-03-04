package multiLevelInheritance;


class C1
{
	C1(){
		System.out.println("Appu");
	}
}
	class B1 extends C1{
		B1(int a){
			super();
			System.out.println("powerstar");
			System.out.println(a);
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B1 b1=new B1(2);
      C1 c1=new C1();
	}

}
