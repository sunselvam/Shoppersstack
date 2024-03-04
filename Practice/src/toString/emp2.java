package toString;

public class emp2 {
	int eid;
	emp2(int eid){
		this.eid=eid;
		
	}

	public String toString() {
		return ""+this.eid;}
	
	public static void main(String[] args) {
		emp2 e2= new emp2(10);
		System.out.println(e2);
		emp2 j1=new emp2(20);
		System.out.println(j1);
	}

}
