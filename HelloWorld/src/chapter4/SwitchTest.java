package chapter4;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		int a, b, value = 0;
		String operator;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하시오: ");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.print("연산자를 입력하시오(+|-|*|/): ");
		
		operator = scanner.next();
		
		switch(operator) {
		case "+" : 
			value = a + b;
			break;
		case "-" :
			value = a - b;
			break;
		case "*" :
			value = a * b;
			break;
		case "/" :
			value = a / b;
			break;
		default :
			System.out.println("잘못된 값이 입력되었습니다.");
			return;
		}
		
		System.out.println(a + operator + b + "=" + value);
		
	}

}
