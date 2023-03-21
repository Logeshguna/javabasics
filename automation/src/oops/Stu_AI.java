package oops;

public class Stu_AI {
	  int sid;
	  String sname;
	  int sub1;
	  int sub2;
	  int sub3;

	  public void getStudata(int sid, String sname) {
	    this.sid = sid;
	    this.sname = sname;
	  }

	  public void getStuMarks(int sub1, int sub2, int sub3) {
	    this.sub1 = sub1;
	    this.sub2 = sub2;
	    this.sub3 = sub3;
	  }

	  public void totalMarks() {
	    int total = sub1 + sub2 + sub3;
	    System.out.println("Student ID: " + sid);
	    System.out.println("Student Name: " + sname);
	    System.out.println("Total Marks: " + total);
	  }
	  public static void main(String[] args) {
		  Stu_AI s = new Stu_AI();
		  s.getStudata(123, "John Smith");
		  s.getStuMarks(80, 90, 70);
		  s.totalMarks();

	  }
	}

