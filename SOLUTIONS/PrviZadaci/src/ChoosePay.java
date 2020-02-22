import payMthPckg.BitCoinPay;
import payMthPckg.CardPay;
import payMthPckg.PayPPay;
import payMthPckg.PouzPay;

public class ChoosePay {
	
	private CardPay cp;
	private PouzPay pp;
	private PayPPay pap;
    private BitCoinPay bcp;
	
	public ChoosePay() {
		cp=new CardPay();
		pp=new PouzPay();
		pap=new PayPPay();
		bcp=new BitCoinPay();
	}
	
	
	public void setPayCard() {
		cp.paymentMethod();
	}
	
	public void setPayPouz() {
		pp.paymentMethod();
	}
	
	public void setPayPayP() {
		pap.paymentMethod();
	}
	
	public void setBitPay() {
		bcp.paymentMethod();
	}

	
	

}
