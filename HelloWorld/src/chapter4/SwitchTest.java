package chapter4;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		int a, b, value = 0;
		String operator;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��Ͻÿ�: ");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.print("�����ڸ� �Է��Ͻÿ�(+|-|*|/): ");
		
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
			System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
			return;
		}
		
		System.out.println(a + operator + b + "=" + value);
		
	}

}
