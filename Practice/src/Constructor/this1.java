package Constructor;

public class this1 {
      String ename;
      double salary;
      int eid;
      public this1(String ename,double salary, int eid) {
      this.ename=ename;
      this.salary=salary;
      this.eid=eid;
      System.out.println(ename+" "+salary+" "+eid);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
this1 e1=new this1("sujan",30000,1);
System.out.println(e1);
	}

}
