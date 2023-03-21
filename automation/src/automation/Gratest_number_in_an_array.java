package automation;

public class Gratest_number_in_an_array {

	public static void main(String[] args) {
		int[] numbers = {3, 7, 2, 9, 5};

		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
		  if (numbers[i] > largest) {
		    largest = numbers[i];
		  }
		  if (numbers[i] < smallest) {
		    smallest = numbers[i];
		  }
		}

		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);

	}

}
