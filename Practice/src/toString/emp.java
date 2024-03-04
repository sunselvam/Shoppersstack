package toString;

public class emp {
	int eid;
	emp(int eid)
	{
		this.eid=eid;
	}
	public static void main(String[] args) {
		emp e1=new emp(10);
		System.out.println(e1);//toString.emp@27f674d
		System.out.println(e1.toString());//toString.emp@27f674d
	}
}
