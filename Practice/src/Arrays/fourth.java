package Arrays;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int esum=0;
        int osum=0;
        for (int i=0; i<a.length; i++) {
        	if(a[i]%2==0) {
        		esum=esum+a[i];
        	}
        	else {
        		osum=osum+a[i];
        	}
        	
        }
        System.out.println(esum);
    	System.out.println(osum);
	}

}
