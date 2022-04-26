package chapter5;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		int []numbers;
		numbers=inputNumber();
		printNumber(numbers);
	}
	
	static int[] inputNumber() {
		Scanner scanner = new Scanner(System.in);
		int []intArr = new int[4];
		for(int i = 0; i < intArr.length; i++) intArr[i] = scanner.nextInt();
		return intArr;
	}
	
	static void printNumber(int intArr[]) {
		int sum = 0;
		for(int temp : intArr) sum += temp;
		System.out.println((double)sum/intArr.length);
	}

}
