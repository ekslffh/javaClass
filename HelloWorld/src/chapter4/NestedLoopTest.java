package chapter4;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {

		int h;
		Scanner scanner = new Scanner(System.in);

		System.out.print("모래시계 높이를 입력하세요 : ");
		h = scanner.nextInt();
		int point = h / 2;

		for (int y = point; y >= -point; y--) {
			
			for (int x = -point; x <= point; x++) {
				int absY = y < 0 ? -y : y;
				int absX = x < 0 ? -x : x;
				if (absX <= absY)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
