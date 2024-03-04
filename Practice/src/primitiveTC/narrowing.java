package primitiveTC;

public class narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int c= 68;
		char a=(char)c;//narrowing
		System.out.println(a);
		
    double d= 408.55;
    char ch= (char) d;//narrowing
    System.out.println(ch);
	}

}
