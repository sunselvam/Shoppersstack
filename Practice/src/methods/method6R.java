package methods;

public class method6R {
 public int appu(int a)
 {
	int fact =1;
	for (int i=1; i<=a; i++)
	{
		 fact =fact*i;
	}
	return fact;
	
}
 public static void main(String[] args) {
	method6R m6=new method6R();
	int jeev=m6.appu(5);
	System.out.println(jeev);
}
}
