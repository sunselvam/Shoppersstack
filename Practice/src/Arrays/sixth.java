package Arrays;

public class sixth {
	public int max(int b[]) {
		int max=b[1];
		for (int i=0; i<b.length;i++)
		{
			if(b[i]>max) {
				max=b[i];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,1,5,6,7};
sixth A=new sixth();
int result=A.max(a);
System.out.println(result);

	}

}
