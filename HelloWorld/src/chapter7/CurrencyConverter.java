package chapter7;

public class CurrencyConverter {
	
	private static int rate;
	
	public static double toDollar(double won) {
		return won / rate;
	}
	
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	
	public static void setRate(int rate) {
		CurrencyConverter.rate = rate;
	}
	
}
