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
		return this.name + ", " + this.price + "��\n";
	}

}

public class ProductTest {

	public static void main(String[] args) {

		String barcode = null, name = null;
		int price = 0;
		Scanner scanner = new Scanner(System.in);
		Product products[] = new Product[3];

		// ��ǰ�Է�
		for (int i = 0; i < 3; i++) {

			System.out.println("## ��ǰ ���� �Է� ##");
			System.out.print("���ڵ� : ");
			barcode = scanner.next();
			System.out.print("��ǰ�� : ");
			name = scanner.next();
			System.out.print("���� : ");
			price = scanner.nextInt();

			products[i] = new Product(barcode, name, price);
			System.out.println(name + " �߰��Ǿ����ϴ�.\n");

		}

		// ��ǰ�˻�
		System.out.println("## ��ǰ �˻� ##");

		while (true) {

			System.out.print("���ڵ� : ");
			barcode = scanner.next();

			if (barcode.equals("Q")) {
				System.out.println("���α׷��� �����մϴ�.");
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
