package Exception;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2);
			int arr[]= {1,2,3,4,5};		
			System.out.println(arr[arr.length]);
			System.out.println('c');
			}
		catch(ArithmeticException e) {
			System.out.println("Exception handled 1");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled 2");
		}
		catch(Exception e) {
			System.out.println("Exception handled 3");
		}
		System.out.println("hello");

	}

}
