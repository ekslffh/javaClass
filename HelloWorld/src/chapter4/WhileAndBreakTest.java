package chapter4;

import java.util.Scanner;

public class WhileAndBreakTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a;
		int n = 0;
		
		while(true) {
			a = scanner.nextInt();
			if(a == -1) break;
			n++;
		}
		
		System.out.println("입력된 숫자 개수는 " + n);
		
	}

}
