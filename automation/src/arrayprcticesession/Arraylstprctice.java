package arrayprcticesession;

import java.util.ArrayList;

public class Arraylstprctice {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list=new ArrayList <String>();
		list.add("rama");
		list.add("Rajan");
		list.add("rajaram");
		System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1,"loki");
        System.out.println(list);
        for (Object s:list) {
        	System.out.println(s);
        }
        
	}

}
