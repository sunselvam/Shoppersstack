package Exception;

public class Exception2 {
	public static void main(String[] args) {
		System.out.println(1);
			System.out.println(2);
			try {
			System.out.println(1/0);
			}
			catch(ArithmeticException exception ){
				System.out.println("exception handled");
			}
				System.out.println(3);
			
			System.out.println(4);
		}
	}


