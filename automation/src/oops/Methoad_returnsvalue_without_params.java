package oops;

public class Methoad_returnsvalue_without_params {

	
		int x=10;
		int y=20;
		
		int sum() {
			return(x+y);
		}
		public static void main(String[] args) {
			 Methoad_returnsvalue_without_params cal=new Methoad_returnsvalue_without_params();
			int res= cal.sum();
			System.out.println(res);
	}

}
