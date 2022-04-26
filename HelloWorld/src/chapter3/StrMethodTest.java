package chapter3;

public class StrMethodTest {

	public static void main(String[] args) {
		String str="CDEFG"; 

		System.out.println("length: "+str.length()); // 5 : str�� ���̴� 5�̴�.

		System.out.println("compare CA: " + str.compareTo("CA")); // 3 : ������ �ڿ� �ִ� str�� �� ũ�Ƿ� ������ : D - A = 100 - 97 = 3

		System.out.println("compare CF: " + str.compareTo("CF")); // -2 : ������ �տ� �ִ� str�� �� �����Ƿ� ������� : D - F = 100 - 102 = -2

		System.out.println("charAt 1: "+str.charAt(1)); // D : 1��° ���� D�̴� (zero-based)

		System.out.println("substring 1,2: "+str.substring(1, 2)); // D : 1��° ������ 2��°�ε��� �������� ��

		System.out.println("indexOf D: "+str.indexOf('D',2)); // -1 : ��ã���� -1��ȯ
		
		System.out.println("equal CDE: "+str.equals("CDE")); // false : ���� �ʴ�.
	}

}
