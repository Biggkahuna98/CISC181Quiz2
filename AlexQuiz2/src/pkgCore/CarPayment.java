package pkgCore;

import org.apache.poi.ss.formula.functions.Finance;

public class CarPayment
{
	private int totalPrice;
	private int downPay;
	private int loanLen;
	private double interest;
	
	public CarPayment(int atotalPrice, int adownPay, int aloanLen, double ainterest)
	{
		totalPrice = atotalPrice;
		downPay = adownPay;
		loanLen = aloanLen;
		interest = ainterest;
	}
	
	public double monthlyPayment()
	{
		return Finance.pmt(interest / 12, loanLen, totalPrice - downPay);
	}
	
	public double totalSpent()
	{
		return (loanLen * monthlyPayment()) + (totalPrice - downPay);
	}
}
