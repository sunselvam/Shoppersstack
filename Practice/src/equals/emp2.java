package equals;

public class emp2 {
	int eid;
	emp2(int eid){
		this.eid=eid;
		
	}
 public boolean equals(Object Obj) {
	 emp2 e2= (emp2)Obj;
	 if (this.eid==e2.eid) {
		 return true;
	 }
	 else {
		 return false;
	 }
	 }
 public static void main(String[] args) {
	emp2 e1=new emp2(1);
	emp2 e2=new emp2(2);
	System.out.println(e1.equals(e2));
	emp2 e3=new emp2(3);
	emp2 e4=new emp2(3);
	System.out.println(e3.equals(e4));
}
}

