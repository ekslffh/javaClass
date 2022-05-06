package chapter9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Diary {
	
	Scanner in = new Scanner(System.in);
	String fileName;
	
	public Diary(String fileName) {
		this.fileName = fileName;
	}
	
	public void showOption() {
		System.out.println("## �� �ϱ��� ##");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.print("�Է��ϼ���: ");
	}
	
	public void write() {
		String day, content;
		System.out.print("��¥: ");
		day = in.nextLine();
		System.out.print("����: ");
		content = in.nextLine();
		
		StringBuilder builderString = new StringBuilder(day);
		builderString.insert(2, "��");
		builderString.insert(5, "��");
		builderString.insert(8, "��");
		
		day = builderString.toString();
		
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(fileName, true));
			out.write(day + System.lineSeparator() + content + System.lineSeparator());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Could not write to file");
		}
		
	}
	
	public void read() {
		String day, content;
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			while(true) {
				day = in.readLine();
				content = in.readLine();
				if (content == null) {
					break;
				}
				System.out.println("��¥: " + day);
				System.out.println("����: " + content);
			}
			in.close();
		} catch(IOException e ) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Diary diary = new Diary("diary.txt");
		int option;
		while(true) {
			diary.showOption();
			option = scanner.nextInt();
			switch(option) {
			case 1:
				diary.read();
				break;
			case 2:
				diary.write();
				break;
			case 3:
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}

}
