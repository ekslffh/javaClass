package chapter6;

public class FruitBuyer {

	int myMoney;
	int numOfApple;
	
	public FruitBuyer(int numOfApple, int myMoney) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
	}
	
	public void buyApple(int money, int numOfApple) {
		myMoney -= money;
		this.numOfApple += numOfApple;
	}
	
	public void showInformation() {
		System.out.println("사과 개수 : " + this.numOfApple + "개");
		System.out.println("보유 금액 : " + this.myMoney);
	}
	
}
