package string;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbbccddeeff";
		char c[]=s.toCharArray();
		String rev =" ";
		for(int i=0; i<c.length;i++) {
			if(rev.indexOf(c[i])==-1) {
				rev=rev+c[i];
			}
		}
		System.out.println(rev);

	}

}
