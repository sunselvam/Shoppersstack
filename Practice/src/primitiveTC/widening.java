package primitiveTC;

public class widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		int b= a;//widening
		System.out.println(b);
		
		int c=16;
		long l= c;//widening
		System.out.println(l);

		char c1='A';
		int i=c1;//widening
        System.out.println(i);
        
        int d=12;
        double d1=d;//widening
        System.out.println(d1);
		

	}

}
