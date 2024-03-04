package Patterns;

public class ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=4;
      for (int row=1; row<=num; row++) {
    	  for (int space =num-1; space>=row; space--) {
    		  System.out.print(" ");
    	  }
    	  for (int col=1; col<=2*row-1; col++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
	}

}
