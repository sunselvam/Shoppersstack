package Constructor;

public class emp {
	String name;
	double salary;
	int eid;
	public emp(String n, double s, int e){
		name=n;
		salary=s;
		eid=e;
		System.out.println("name:"+name+" "+"salary:"+salary+" "+"eid:"+eid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1=new emp("sujan",40000,1);
		emp e2=new emp("jeevan",50000,2);

	}

}
