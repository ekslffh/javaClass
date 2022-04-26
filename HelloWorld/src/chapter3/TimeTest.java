package chapter3;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = scanner.nextInt();
		
		int second = input % 60;
		int minute = (input / 60) % 60;
		int hour = input / 3600;
		
		System.out.println(input + "초는 " + hour + "시간, " + minute + "분, " + second + "초 입니다.");
	}
}


