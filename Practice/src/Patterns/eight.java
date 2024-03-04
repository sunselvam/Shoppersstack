package Patterns;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=4; row++) {
			int k=row;
			for(int col=1; col<=4; col++) {
				if (col%2==1) {
					System.out.print(k);
					k=row+3;
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
