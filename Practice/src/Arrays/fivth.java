package Arrays;

public class fivth {
	public static int sum(int b[]) {
		int sum=0;
		for (int i=0; i<b.length; i++) {
			sum=sum+b[i];//sum+=b[i]
		}
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int result =sum(a);
System.out.println(result);
	}

}
