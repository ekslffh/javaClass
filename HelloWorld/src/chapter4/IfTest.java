package chapter4;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		int a, b;
		String sign;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��Ͻÿ�: ");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a > b) sign = ">";
		else if(a < b) sign = "<";
		else sign = "==";
		
		System.out.println(a + sign + b);
		
	}

}
