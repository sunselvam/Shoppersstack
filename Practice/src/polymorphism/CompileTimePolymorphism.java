package polymorphism;

public class CompileTimePolymorphism {
	
		 public void method(int a) {
			 System.out.println("Rajakumara");
		 }
	
		public void method(int a, int b) {
			System.out.println("yuvaratna");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism a1=new CompileTimePolymorphism();
		a1.method(10);
		a1.method(10, 20);
		

	}

}
