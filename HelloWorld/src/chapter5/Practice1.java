package chapter5;

import java.util.Random;

public class Practice1 {

	public static void main(String[] args) {
		printRandomNumber(2, 7, 10);
		printRandomNumber(100, 110, 15);
	}
	
	static void printRandomNumber(int min, int max, int number) {
		Random r = new Random();
		for(int i = 0; i < number; i++) System.out.print(r.nextInt(max - min + 1) + min + " ");
		System.out.println();
	}

}
