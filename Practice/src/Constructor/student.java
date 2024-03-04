package Constructor;

public class student {
	String sname;
    int    sid;
    double sperc;
    public student(String n, int i, double p) {
    	sname=n;
    	sid=i;
    	sperc=p;
    	System.out.println("sname:"+sname+" "+"sid:"+sid+" "+"sperc:"+sperc);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student("sujan",1,34.55);
		student s2=new student("jeevan",2,93.76);
		student s3=new student("santosh",3,35);
		student s4=new student("harish",4,50);
		student s5=new student("prem",5,93.56);

	}

}
