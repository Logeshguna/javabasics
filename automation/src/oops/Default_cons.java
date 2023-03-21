package oops;

public class Default_cons {
	 int x;
	 int y;

	public Default_cons() {
	     x=10;
		 y=20;
	}
	void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_cons cal=new Default_cons();
		cal.display();
	}

}
