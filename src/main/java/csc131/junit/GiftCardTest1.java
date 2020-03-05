package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest1
{
	@Test
	public void getIssuingStore()
	{
		double       balance;        
		GiftCard     card;
		int          issuingStore;
		
		issuingStore = 1337;
		balance      = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}
	
	@Test
	public void getBalance()
	{
		double       balance;        
		GiftCard     card;
		int          issuingStore;
		
		issuingStore = 1337;
		balance      = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	@Test
	public void deduct()
	{
		double       balance;        
		GiftCard     card;
		int          issuingStore;
		String       remainingBalance;
		
		
		issuingStore     = 1337;
		balance          = 100.00;
		remainingBalance = "Remaining Balance: " + String.format("%6.2f", 60.00);
		
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("deduct(40.00)", remainingBalance, card.deduct(40.00));
	}
}
