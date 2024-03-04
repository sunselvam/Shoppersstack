package methodOverRiding;


public class Father {
	
	void light() {
		System.out.println("halogen light");
	}}
   class Son extends Father{
	   void light() {
		   System.out.println("LED light");
	   }
   }
   class Driver{
	   public static void main(String[] args) {
		Father f=new Father();
		f.light();
		Son s=new Son();
		s.light();
		f=s;
		f.light();
		
	}
   }

