package oops;

public class Cons_with_prams {
	int x;
	int y;
	

	public Cons_with_prams(int a,int b) {
		// TODO Auto-generated constructor stub
		x=a;
		y=b;
		
	}
	void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons_with_prams c1=new Cons_with_prams(10,100);
		c1.display();

	}

}
