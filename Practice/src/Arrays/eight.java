package Arrays;
import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("enter the element");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
