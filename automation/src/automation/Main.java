package automation;

public class Main {
	  public static void main(String[] args) {
	    int[] array = {10,20,30}; // initialize the array with some values
	    int sum = 0; // initialize the sum to 0
	    
	    // iterate through the array and add each value to the sum
	    for (int value : array) {
	      sum += value;
	    }
	    
	    System.out.println("The sum of the values in the array is: " + sum);
	  }
	}