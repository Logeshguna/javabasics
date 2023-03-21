package oops;

public class Student_assignment {
	int SID;
	String sname;
	int sub1;
	int sub2;
	int sub3;
	void getstudentData(int id,String name) {
		 SID=id;
		sname=name;
		
	}
	void getstudentmarks(int english,int maths,int phy) {
		sub1=english;
		sub2=maths;
		 sub3=phy;
		
	}
	void display() {
		int total=sub1+sub2+sub3;
		System.out.println(SID);
		System.out.println(sname);
		System.out.println(total);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_assignment ci=new Student_assignment();
		ci.getstudentmarks(10, 20, 30);
        ci.getstudentData(1, "adam");
        ci.display();
	}

}
