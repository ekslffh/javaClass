package chapter6;

import java.util.Scanner;

public class FruitSalesMainExcercise {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		FruitSeller sellerA = new FruitSeller(10, 3000, 1000);
		FruitSeller sellerB = new FruitSeller(15, 4000, 900);
		
		FruitBuyer buyer = new FruitBuyer(2, 10000);
		
		System.out.println("==���� ���� ��==");
		System.out.println("���� �Ǹ���A");
		sellerA.showInformation();
		System.out.println("\n���� �Ǹ���B");
		sellerB.showInformation();
		System.out.println("\n���� ������");
		buyer.showInformation();
		
		int numOfApple;
		System.out.print("\n���� �Ǹ���A���� ��� �� ���� ��ðڽ��ϱ�? ");
		numOfApple = scanner.nextInt();
		sellerA.sellApple(buyer, numOfApple);
		
		System.out.print("���� �Ǹ���B���� ��� �� ���� ��ðڽ��ϱ�? ");
		numOfApple = scanner.nextInt();
		sellerB.sellApple(buyer, numOfApple);
		
		System.out.println("\n==���� ���� ��==");
		System.out.println("���� �Ǹ���A");
		sellerA.showInformation();
		System.out.println("\n���� �Ǹ���B");
		sellerB.showInformation();
		System.out.println("\n���� ������");
		buyer.showInformation();
	}

}
