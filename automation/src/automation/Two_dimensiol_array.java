package automation;

public class Two_dimensiol_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4},{5,6},{7,8},{9,10}};
		System.out.println("Number of rows"+a.length);
		System.out.println("numeber of coloums"+a[0].length);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		for(int s[]:a) {
			for(int n:s) {
				System.out.println("formated array is"+n);
			}
		}
		String s[]= {"Selenium Interview"};
		for(String d:s) {
			System.out.println(d);
		}

	}

}
