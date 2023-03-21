package oops;

public class Oppos_intro {

	int sno;
	String name;
	int age;
	int department;
	
	void display() {
		System.out.println(sno);
		System.out.println(name);
		System.out.println(age);
		System.out.println(department);
	}
	public static void main(String args[]) {
		Oppos_intro std1=new Oppos_intro();
		std1.sno=1;
		std1.name="loki";
		std1.age=27;
		std1.department=1;
		std1.display();
	    Oppos_intro std2=new Oppos_intro();
	    std2.sno=2;
		std2.name="log";
		std2.age=32;
		std2.department=2;
		std2.display();
	}
	
	
}
