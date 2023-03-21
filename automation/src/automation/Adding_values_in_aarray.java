package automation;

public class Adding_values_in_aarray {

	public static void main(String[] args) {
		int a[]= {20,30,50};
		int s=0;
		System.out.println("Length of an array is"+a.length);
		for (int i=0;i<a.length;i++) {
			s+=a[i];
		}
		System.out.println(s);
	}

}
