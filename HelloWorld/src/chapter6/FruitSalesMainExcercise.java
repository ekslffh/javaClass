package chapter6;

import java.util.Scanner;

public class FruitSalesMainExcercise {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		FruitSeller sellerA = new FruitSeller(10, 3000, 1000);
		FruitSeller sellerB = new FruitSeller(15, 4000, 900);
		
		FruitBuyer buyer = new FruitBuyer(2, 10000);
		
		System.out.println("==과일 구매 전==");
		System.out.println("과일 판매자A");
		sellerA.showInformation();
		System.out.println("\n과일 판매자B");
		sellerB.showInformation();
		System.out.println("\n과일 구매자");
		buyer.showInformation();
		
		int numOfApple;
		System.out.print("\n과일 판매자A에서 사과 몇 개를 사시겠습니까? ");
		numOfApple = scanner.nextInt();
		sellerA.sellApple(buyer, numOfApple);
		
		System.out.print("과일 판매자B에서 사과 몇 개를 사시겠습니까? ");
		numOfApple = scanner.nextInt();
		sellerB.sellApple(buyer, numOfApple);
		
		System.out.println("\n==과일 구매 후==");
		System.out.println("과일 판매자A");
		sellerA.showInformation();
		System.out.println("\n과일 판매자B");
		sellerB.showInformation();
		System.out.println("\n과일 구매자");
		buyer.showInformation();
	}

}
