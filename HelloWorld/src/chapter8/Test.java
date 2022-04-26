package chapter8;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		PhoneInfo[] p = new PhoneInfo[100];
		
		for(int i = 0; i < 3; i++) {
			p[i] = new PhoneInfo("user" + (i+1), "0101234999" + (i+1), "99020" + (i+1));
		}
		
		System.out.println("--------------------------------");
		for(int i = 0; i < 3; i++) {
			p[i].showPhoneInfo();
		}
		
		p[0] = p[1];
		
		System.out.println("--------------------------------");
		for(int i = 0; i < 3; i++) {
			p[i].showPhoneInfo();
		}
		
		p[1].setName("mario");
		
		System.out.println("--------------------------------");
		for(int i = 0; i < 3; i++) {
			p[i].showPhoneInfo();
		}
		
		System.out.println(p[0] == p[1]);
		System.out.println(p[1] == p[2]);
		
	}

}
