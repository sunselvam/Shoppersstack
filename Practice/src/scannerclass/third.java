package scannerclass;
import java.util.*;
public class third {
	public static int sumofEvenNo(int num)
	{
		int esum=0;
		for (int i=1; i<=num; i++) {
			if(i%2==0)
			{
				esum=esum+i;
			}
		}
		return esum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int result=sumofEvenNo(num);
System.out.println(result);
	}

}
