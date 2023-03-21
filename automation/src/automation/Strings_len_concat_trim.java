package automation;

public class Strings_len_concat_trim {

	public static void main(String[] args) {
	 	String s="Welcome";
	 	String s1= "To Java";
	 	System.out.println("the length of the given string is" +s.length());
	 	System.out.println("Concatination of string is"+s.concat(s1));
		 
	 	
	 	String S2="  welcome     ";
	 	System.out.println(S2);
	 	System.out.println(S2.trim());
	 	System.out.println(s.charAt(3));
	 	System.out.println(s.contains("W"));

	}

}
