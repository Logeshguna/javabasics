package automation;

public class multiplcation_of_matrix {

	public static void main(String[] args) {
		int[][] matrix1 = {{2, 3}, {4, 5}};
		int[][] matrix2 = {{2, 1}, {3, 4}};
		int[][] result = new int[2][2]; // create a new 2D array to store the result

		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 2; j++) {
		        result[i][j] = matrix1[i][j] + matrix2[i][j];
		    }
		}

		// print the result
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 2; j++) {
		        System.out.print(result[i][j] + " ");
		    }
		    System.out.println();
		}
	



	}

}
