package string;

public class Reverseurname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Jeevan";
		String rev="";
for (int i=s1.length()-1; i>=0;i--) {
	rev = rev+s1.charAt(i);
	
}
System.out.println(rev);
	}

}
