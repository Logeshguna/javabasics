package oops;

    class Teacher{
	String Designation = "teacher";
	String College_name="xyz";
	void dose() {
		System.out.println("she is lab assistent");
	}
    }
	
	class Computer_teacher extends Teacher{
		String Designation = "computer teacher";
		String College_name="xyz";
		void dose() {
			System.out.println("she is a proffessor"+Designation+" "+College_name);
		}
		
	}
	public class Inheritance_conc {
	public static void main(String[] args) {
		Computer_teacher t1=new Computer_teacher();
		t1.dose();
		Teacher t2=new Teacher();
		t2.dose();
		
		
	}

}
