package chapter8;

import java.util.Scanner;

class PhoneInfo {
	private String name, phoneNumber, birth;

	public PhoneInfo(String name, String phoneNumber, String birth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		System.out.println("birth: " + birth);
	}

}

class PhoneBookManager {
	private static PhoneInfo[] infoStorage = new PhoneInfo[100];
	private static int curCnt = 0;
	private static String name, phoneNumber, birth;

	public static void inputData() {
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.print("�̸�: ");
		name = MenuViewer.keyboard.next();
		System.out.print("��ȭ��ȣ: ");
		phoneNumber = MenuViewer.keyboard.next();
		System.out.print("�������: ");
		birth = MenuViewer.keyboard.next();

		StringBuilder builderString = new StringBuilder(phoneNumber);
		builderString.insert(3, "-");
		builderString.insert(8, "-");
		phoneNumber = builderString.toString();

		builderString.setLength(0);
		builderString.append(birth);
		builderString.insert(2, "��");
		builderString.insert(5, "��");
		builderString.append("��");
		birth = builderString.toString();

		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
		infoStorage[curCnt++] = new PhoneInfo(name, phoneNumber, birth);
	}

	public static void searchData() {
		boolean isExist = false;
		System.out.println("������ �˻��� �����մϴ�.");
		System.out.print("�̸�: ");
		name = MenuViewer.keyboard.next();
		for (int i = 0; i < curCnt; i++) {
			if (name.equals(infoStorage[i].getName())) {
				isExist = true;
				infoStorage[i].showPhoneInfo();
			}
		}
		if (isExist)
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
		else
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
	}

	public static void deleteData() {
		boolean isExist = false;
		int index = 0;
		System.out.println("������ ������ �����մϴ�.");
		System.out.print("�̸�: ");
		name = MenuViewer.keyboard.next();
		for (int i = 0; i < curCnt; i++) {
			if (name.equals(infoStorage[i].getName())) {
				isExist = true;
				index = i;
			}
		}

		if (isExist) {
			curCnt--;
			for (int i = index; i < curCnt; i++) {
				infoStorage[i].setName(infoStorage[i + 1].getName());
				infoStorage[i].setPhoneNumber(infoStorage[i + 1].getPhoneNumber());
				infoStorage[i].setBirth(infoStorage[i + 1].getBirth());
			}
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");
		} else
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
	}

}

class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("����: ");
	}
}

public class PhoneBook {

	public static void main(String[] args) {

		int choice;

		while (true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();

			switch (choice) {
			case 1:
				PhoneBookManager.inputData();
				break;
			case 2:
				PhoneBookManager.searchData();
				break;
			case 3:
				PhoneBookManager.deleteData();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}

	}

}
