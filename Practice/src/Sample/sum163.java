package Sample;

public class sum163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =163;
		int sum =0;
		while (num>0) {
			int rem= num%10;
			sum=sum+rem;
        	num=num/10;
		}
          System.out.println(sum);
	}

}
