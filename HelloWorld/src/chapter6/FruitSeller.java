package chapter6;

public class FruitSeller {
	
	private int numOfApple;
	private int myMoney = 0;
	private final int applePrice;
	
	public FruitSeller(int numOfApple, int myMoney, int applePrice) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		this.applePrice = applePrice;
	}

	public void sellApple(FruitBuyer buyer, int numOfApple) {
		this.numOfApple -= numOfApple;
		this.myMoney += numOfApple * applePrice;
		buyer.buyApple(numOfApple * applePrice, numOfApple);
	}
	
	public void showInformation() {
		System.out.println("사과 개수 : " + this.numOfApple + "개");
		System.out.println("단가 : " + this.applePrice + "원");
		System.out.println("잔액 : " + this.myMoney + "원");
	}
	
}
