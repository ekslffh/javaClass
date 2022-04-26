package chapter7;

import java.util.Scanner;

class Product {

	private String barcode;
	private String name;
	private int price;

	public Product(String barcode, String name, int price) {
		this.barcode = barcode;
		this.name = name;
		this.price = price;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getInformation() {
		return this.name + ", " + this.price + "원\n";
	}

}

public class ProductTest {

	public static void main(String[] args) {

		String barcode = null, name = null;
		int price = 0;
		Scanner scanner = new Scanner(System.in);
		Product products[] = new Product[3];

		// 상품입력
		for (int i = 0; i < 3; i++) {

			System.out.println("## 상품 정보 입력 ##");
			System.out.print("바코드 : ");
			barcode = scanner.next();
			System.out.print("상품명 : ");
			name = scanner.next();
			System.out.print("가격 : ");
			price = scanner.nextInt();

			products[i] = new Product(barcode, name, price);
			System.out.println(name + " 추가되었습니다.\n");

		}

		// 상품검색
		System.out.println("## 상품 검색 ##");

		while (true) {

			System.out.print("바코드 : ");
			barcode = scanner.next();

			if (barcode.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			else {
				for (Product product : products) {
					if (barcode.equals(product.getBarcode())) {
						System.out.println(product.getInformation());
						break;
					}
				}
			}
		}
	}

}
