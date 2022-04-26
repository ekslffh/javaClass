package chapter8;

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

	public Product(String barcode, String name) {
		this(barcode, name, 0);
	}

	public Product(String barcode, int price) {
		this(barcode, "No name", price);
	}

	public Product(String barcode) {
		this(barcode, "No name", 0);
	}

	public String getBarcode() {
		return barcode;
	}

	public String getName() {
		return name;
	}

	public int price() {
		return price;
	}

	public String getInformation() {
		return this.name + ", " + this.price + "��\n";
	}

}

public class ProductTest {

	public static void main(String[] args) {

		String barcode = null, name = null, price = null;
		Scanner scanner = new Scanner(System.in);
		Product products[] = new Product[3];

		// ��ǰ�Է�
		for (int i = 0; i < 3; i++) {

			System.out.println("## ��ǰ ���� �Է� ##");
			System.out.print("���ڵ� : ");
			barcode = scanner.nextLine();
			System.out.print("��ǰ�� : ");
			name = scanner.nextLine();
			System.out.print("���� : ");
			price = scanner.nextLine();

			if ((name.isEmpty()) && (price.isEmpty())) {
				products[i] = new Product(barcode);
			} else if (name.isEmpty()) {
				products[i] = new Product(barcode, Integer.parseInt(price));
			} else if (price.isEmpty()) {
				products[i] = new Product(barcode, name);
			} else {
				products[i] = new Product(barcode, name, Integer.parseInt(price));
			}

			System.out.println(products[i].getName() + " �߰��Ǿ����ϴ�.\n");

		}

		// ��ǰ�˻�
		System.out.println("## ��ǰ �˻� ##");

		while (true) {

			System.out.print("���ڵ� : ");
			barcode = scanner.nextLine();

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
