package komalpractis;

import java.util.Arrays;
public class ReverseArray1 {
	public static void main(String[] args) { 
	int[][] matrix = {
	{1, 2, 3},
	{4, 5, 6},
	{7, 8, 9}
	};
	System.out.println("Original Matrix:"); 
	printMatrix(matrix);
	System.out.println("\nReversed Matrix:"); 
	reverseMatrix(matrix);
	printMatrix(matrix);
	}
	private static void reverseMatrix(int[][] matrix) { 
	for (int i = 0; i < matrix.length; i++) {
	int intstart = 0;
	int end = matrix[i].length - 1;
	int start = 0;
	while (start < end) {
	int temp = matrix[i][start];
	matrix[i][start] = matrix[i][end]; 
	matrix[i][end] = temp;
	start++;
	end--;
	}
	}
	}
	private static void printMatrix(int[][] matrix){ 
	for (int[] row : matrix) {
	System.out.println(Arrays.toString(row));
	}
	}
	}
	