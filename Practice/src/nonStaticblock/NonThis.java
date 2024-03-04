package nonStaticblock;

public class NonThis {
	    int a=10;//GV
	    {
	    	int a=20;
	    	this.a=this.a+a;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mainmethod");
		NonThis a1=new NonThis();
		System.out.println(a1.a);
		

	}

}
