package oops;

public class Employee {
	int empid;
	String empname;
	int age;
	
	Employee(int Id,String name,int years){
		empid=Id;
		empname=name;
		age=years;
	}
	
	void getvalues(int Id,String name,int years) { // Using methoad
		empid=Id;
		empname=name;
		age=years;
		
	}
	
	void display() {
		System.out.println(empid+"  " +empname+" "+age);
	}
      
}
