package methodoverloading;

public class third {
	public static void m(int a, char b)
	{
		System.out.println("appu");
	}
	public static void m(char a, int b)
	{
		System.out.println("power");
	}
	public static void main(String[] args) {
		m(19,'d');
		m('c',27);
	}

}
