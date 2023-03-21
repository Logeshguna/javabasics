package automation;

public class Search_for_specific_string_in_an_array {

	public static void main(String[] args) {
		 String s[]= {"Selenium interview"};
		 for (int i=0;i<s.length;i++) {
			 System.out.println(s[i]);
			 if (s[i].contains("interdell")) {
				 System.out.println("Entered charcter is present");
			 }
			 else {
				 System.out.println("Enterd charcter is not present");
			 }
		 }

	}

}
