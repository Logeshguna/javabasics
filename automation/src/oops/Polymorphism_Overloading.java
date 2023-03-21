package oops;

public class Polymorphism_Overloading {
	void sum(int x,int y) {
		System.out.println(x+y);
		
	}
	void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	void sum(double x, double y) {
		System.out.println(x+y);
	}
	void sum(double x,double y,double z) {
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		Polymorphism_Overloading cat=new Polymorphism_Overloading();
		cat.sum(20.7, 40.7);
		cat.sum(34.76, 65.98,77.65);
		
	}

}
