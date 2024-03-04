package nonStaticblock;

public class NonStatic3 {
int a=10;
{
		a=40;
	}
{
	a=50;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		NonStatic3 a1=new NonStatic3();
		System.out.println(a1.a);

	}

}
