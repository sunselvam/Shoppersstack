package Sample;

public class while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		int sum=0;	
		while(i<=10)
		{
			if(i%2==1) {
				sum= sum+i;
				
			}
			
			i++;
			
		}
		System.out.println(sum);

	}

}
