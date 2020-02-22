package payMthPckg;

public class BitCoinPay implements PaymentInterface {
	
	public BitCoinPay() {
		
	}

	@Override
	public void paymentMethod() {
		System.out.println("Placanje BitCoin-om...");
		
	}

}
