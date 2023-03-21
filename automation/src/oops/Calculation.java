package oops;

public class Calculation {
	int x;
	int y;
	int z;

	public Calculation(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	void sum() {
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		Calculation cq=new Calculation(20,10,15);
		cq.sum();

	}

}
