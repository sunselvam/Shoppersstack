package Arrays;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {10,20,30,40,50};
     System.out.println(a[0]);
     System.out.println(a[4]);
     System.out.println(a[a.length-1]);// last index
     System.out.println(a.length);//5 it shows the length of the array
     System.out.println(a[a.length]);//it shows ArrayOutOfBoundsException
	}

}
