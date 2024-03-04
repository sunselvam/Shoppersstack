package Sample;

public class nested1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		if((ch>='A')&&(ch<='Z')|| (ch>='a')&&(ch<='z'))
		{
			if ((ch>='A')&&(ch<='Z'))
			{
				if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					System.out.println("it's a upper case vowel");
				}
				else
				{
					System.out.println("its a upper case consonent");
				}
			}
				else// for lower case
				{
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					{
					  System.out.println("its a lower case vowel");	
					}
					else
					{
						System.out.println("its a lower case consonent");
					}
				}
		}
				
					else if(ch>='0' && ch<='9')
					{
						System.out.println("its a number");
					}
					else {
						System.out.println("its a special character");
					
			}
					
		
	
	}

}
