package entities;

public class CurrencyConverter {

	public static final double IOF = 6.0;

	public static double conversor(double doleta, double quantity) {
		double valor = doleta * quantity;
				
		return valor += valor * IOF /100;
	}

}
