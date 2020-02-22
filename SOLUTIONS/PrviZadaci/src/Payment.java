
public class Payment {
	
	 private int n;
	 private ChoosePay chp;
	
	public Payment(int n) {
		this.n=n;
		chp=new ChoosePay();
		switch(n) {
		case 1: chp.setPayCard();break;
		case 2:chp.setPayPouz();break;
		case 3:chp.setPayPayP();break;
		case 4:chp.setBitPay();break;
		default: System.out.println("Unesi 1,2,3 ili 4!!!");
		}
 		
		
	}
	
	
	

}
