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
		System.out.println("## 내 일기장 ##");
		System.out.println("1. 보기");
		System.out.println("2. 쓰기");
		System.out.println("3. 종료");
		System.out.print("입력하세요: ");
	}
	
	public void write() {
		String day, content;
		System.out.print("날짜: ");
		day = in.nextLine();
		System.out.print("내용: ");
		content = in.nextLine();
		
		StringBuilder builderString = new StringBuilder(day);
		builderString.insert(2, "년");
		builderString.insert(5, "월");
		builderString.insert(8, "일");
		
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
				System.out.println("날짜: " + day);
				System.out.println("내용: " + content);
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
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요");
			}
		}
	}

}
