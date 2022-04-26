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
		System.out.println("데이터 입력을 시작합니다..");
		System.out.print("이름: ");
		name = MenuViewer.keyboard.next();
		System.out.print("전화번호: ");
		phoneNumber = MenuViewer.keyboard.next();
		System.out.print("생년월일: ");
		birth = MenuViewer.keyboard.next();

		StringBuilder builderString = new StringBuilder(phoneNumber);
		builderString.insert(3, "-");
		builderString.insert(8, "-");
		phoneNumber = builderString.toString();

		builderString.setLength(0);
		builderString.append(birth);
		builderString.insert(2, "년");
		builderString.insert(5, "월");
		builderString.append("일");
		birth = builderString.toString();

		System.out.println("데이터 입력이 완료되었습니다.\n");
		infoStorage[curCnt++] = new PhoneInfo(name, phoneNumber, birth);
	}

	public static void searchData() {
		boolean isExist = false;
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름: ");
		name = MenuViewer.keyboard.next();
		for (int i = 0; i < curCnt; i++) {
			if (name.equals(infoStorage[i].getName())) {
				isExist = true;
				infoStorage[i].showPhoneInfo();
			}
		}
		if (isExist)
			System.out.println("데이터 검색이 완료되었습니다.\n");
		else
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
	}

	public static void deleteData() {
		boolean isExist = false;
		int index = 0;
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("이름: ");
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
			System.out.println("데이터 삭제가 완료되었습니다.\n");
		} else
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
	}

}

class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택: ");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
