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
		System.out.println("��� ���� : " + this.numOfApple + "��");
		System.out.println("�ܰ� : " + this.applePrice + "��");
		System.out.println("�ܾ� : " + this.myMoney + "��");
	}
	
}
