package Sample;

public class for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int esum=0;
		int osum=0;
		for(int i=1; i<=20; i++)
		{
         if(i%2==0) {
        	 esum=esum+i;
         }
         else {
        	 osum=osum+i;
         }
	}
     System.out.println(esum);
     System.out.println(osum);
	}
}