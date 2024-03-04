package casting;

public class Driver2 {
	public static void main(String[] args) {	
	
	A1 a1=new B1();
	B1 a2=(B1) a1;
    System.out.println(a2.a);
    System.out.println(a2.b);
    System.out.println(a2.n);
}
}