package chapter3;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int input = scanner.nextInt();
		
		int second = input % 60;
		int minute = (input / 60) % 60;
		int hour = input / 3600;
		
		System.out.println(input + "�ʴ� " + hour + "�ð�, " + minute + "��, " + second + "�� �Դϴ�.");
	}
}


