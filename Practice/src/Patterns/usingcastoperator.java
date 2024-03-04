package Patterns;

public class usingcastoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=64;
		for (int row=1; row<=4; row++)
		{
			for (int col=1; col<=4; col++) {
				System.out.print((char)(k+col)+" ");
			}
			System.out.println();
		}

	}

}
