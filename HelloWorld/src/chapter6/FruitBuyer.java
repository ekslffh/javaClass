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
		System.out.println("��� ���� : " + this.numOfApple + "��");
		System.out.println("���� �ݾ� : " + this.myMoney);
	}
	
}
