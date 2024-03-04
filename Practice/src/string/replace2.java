package string;

public class replace2 {
	public static void main(String[] args) {
		String s="aaa bbb ccc dd ee";
	    s=	s.replace(" ", "");
	    System.out.println(s);
	    char c[]=s.toCharArray();
	    String rev= " ";
	    for(int i=0;i<c.length;i++) {
	    	if (rev.indexOf(c[i])==-1) {
	    		rev=rev+c[i];
	    	}
	    }
	    s=rev.trim();
	    System.out.println(s);
	    }

}
