package automation;

public class Even_and_odd_numbers_in_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("The number is even number"+a[i]);
			}
			else {
				System.out.println("The number is odd number"+a[i]);
			}
		}

	}

}
