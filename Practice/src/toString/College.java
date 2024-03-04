package toString;

public class College {
	String sname;
	int ssem;
	int sback;
	College(String sname , int ssem ,int sback){
		this.sname=sname;
		this.ssem=ssem;
		this.sback=sback;
		
	}
	public String toString() {
		return "sname:"+this.sname+"\n"+"ssem:"+this.ssem+"\n"+"sback:"+this.sback;
	}
	public static void main(String[] args) {
		College c1= new College("Jeevan",4,2);
		System.out.println(c1);
	}

}
