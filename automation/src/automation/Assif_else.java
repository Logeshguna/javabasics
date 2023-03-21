package automation;

public class Assif_else {

	public static void main(String[] args) {
		int a = 100;
		int b = 110;
		int c = 80;
		
		if(a>b && a>c || b<a && c<a) {
			System.out.println("a is gratest");
		}
		else if(b>a && b>c || c<b && a<b) {
			System.out.print("print b is gratest");
		}
		else if(c>a && c>b || a<c &&  b<c) {
			System.out.println("print c is gratest");
		}
	}

}
