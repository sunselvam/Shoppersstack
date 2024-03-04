package Exception;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2);
			//System.out.println(1/0);
			System.out.println(3);
			System.out.println(4);
			System.out.println(3/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
