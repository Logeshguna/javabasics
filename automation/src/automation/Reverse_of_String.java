package automation;

public class Reverse_of_String {
	public static void main(String[] args) {
		String a= "madam";
		String rev= "";
		
		
		char b[]= a.toCharArray();
		int len = a.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+b[i];
		}
		System.out.println(rev);
		if (a.equals(rev)) {
			System.out.println(rev+"plandrome");
		}
		else {
			System.out.println(rev+"is not a plandrome");
		}
     
		
		
	
	}

}
