package equals;

public class emp {
	int eid;
	emp(int eid){
		this.eid=eid;
		
	}
public static void main(String[] args) {
	emp e1= new emp(1);
	emp e2=new emp(2);
	System.out.println(e1.equals(e2));
	emp e3=e1;
	System.out.println(e3.equals(e1));
}
}
