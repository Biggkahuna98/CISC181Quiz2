package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.CarPayment;

public class CarPaymentTest
{
	@Test
	public void test() 
	{
		CarPayment payment = new CarPayment(35000, 0, 60, 0.10);
		
		// I don't know why, but whenever I try to run the test I get an
		// initializationError and it doesn't make any sense since it's
		// initialized.
		assertEquals(-743.65, payment.monthlyPayment(), 0.00);
		assertEquals(-9618.79, payment.totalSpent(), 0.00);
	}

}
