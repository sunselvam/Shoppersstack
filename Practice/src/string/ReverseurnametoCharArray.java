package string;

public class ReverseurnametoCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Jeevan";
		char c[]=s.toCharArray();
		String rev="";
		
		for (int i=c.length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
System.out.println(rev);
	}

}
