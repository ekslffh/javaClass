package chapter3;

public class StrMethodTest {

	public static void main(String[] args) {
		String str="CDEFG"; 

		System.out.println("length: "+str.length()); // 5 : str의 길이는 5이다.

		System.out.println("compare CA: " + str.compareTo("CA")); // 3 : 사전상 뒤에 있는 str이 더 크므로 양수출력 : D - A = 100 - 97 = 3

		System.out.println("compare CF: " + str.compareTo("CF")); // -2 : 사전상 앞에 있는 str이 더 작으므로 음수출력 : D - F = 100 - 102 = -2

		System.out.println("charAt 1: "+str.charAt(1)); // D : 1번째 값은 D이다 (zero-based)

		System.out.println("substring 1,2: "+str.substring(1, 2)); // D : 1번째 값부터 2번째인덱스 전까지의 값

		System.out.println("indexOf D: "+str.indexOf('D',2)); // -1 : 못찾으면 -1반환
		
		System.out.println("equal CDE: "+str.equals("CDE")); // false : 같지 않다.
	}

}
