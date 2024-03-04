package string;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(4));
		//System.out.println(s1.charAt(s1.length()));//String out of bound Exception
		System.out.println(s1.charAt(s1.length()-3));

	}

}
