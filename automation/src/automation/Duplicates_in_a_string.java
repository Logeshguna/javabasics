package automation;

public class Duplicates_in_a_string {

	public static void main(String[] args) {
		String a = "malayalam";
		int count=0;
		char b[]= a.toCharArray();
		int len=b.length;
		for (int i=0;i<len;i++) {
			count=1;
			for(int j=i+1;j<len;j++) {
				if(b[i] == b[j]&&b[i] != ' ') {
					count++;
					 b[j]='0';
					
				}
			}
			if(count>1 && b[i]!='0') {
				System.out.println(b[i]);
			}
		}
		
		

	}

}
