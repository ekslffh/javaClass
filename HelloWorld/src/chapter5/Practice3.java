package chapter5;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		final int MATRIX_TOTAL = 2;
		int matrix[][][] = new int[MATRIX_TOTAL][3][2];
		for (int i = 0; i < MATRIX_TOTAL; i++) {
			printTitle(i);
			inputMatrix(matrix[i]);
		}
		printMatrixSum(matrix);
	}
	
	static void printTitle(int num) {
		System.out.println("Enter the elements of matrix " + (num + 1));
	}
	
	static void inputMatrix(int tempArray[][]) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < tempArray.length; i++) {
			for(int j = 0; j < tempArray[i].length; j++) {
				System.out.print("Enter " + (i+1) + (j+1) + ": ");
				tempArray[i][j] = scanner.nextInt();
			}
		}
	}
	
	static void printMatrixSum(int temp[][][]) {
		int result[][] = new int[3][2];
		System.out.println("Sum of matrix:");
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = temp[0][i][j] + temp[1][i][j];
				System.out.println(temp[0][i][j] + "+" + temp[1][i][j] + "=" + result[i][j]);
			}
		}
	}

}
