package chapter6;

class MyExp {
	int base;
	int exp;
	
	int getValue() {
		return (int)Math.pow(base, exp);
	}
}

public class DoExp {
	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		number1.base = 2;
		number1.exp = 3;
		MyExp number2 = new MyExp();
		number2.base = 3;
		number2.exp = 4;
		
		System.out.println("2�� 3�� = " + number1.getValue());
		System.out.println("3�� 4�� = " + number2.getValue());
	}
}
