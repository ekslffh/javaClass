package chapter5;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];
		int result[][] = new int[2][2];
		
		System.out.println("Enter the elements of matrix 1");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print("Enter " + (i + 1) + (j + 1) + ": ");
				arr1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter the elements of matrix 2");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print("Enter " + (i + 1) + (j + 1) + ": ");
				arr2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Sum of matrix:");
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println(arr1[i][j] + "+" + arr2[i][j] + "=" + result[i][j]);
			}
		}
		
	}

}
