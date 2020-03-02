package csc131.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GiftCardTest {
	double balance;
	GiftCard card;
	int issuingStore;
	
	@BeforeEach
	void setUp() {
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
	}
	
	@Test
	void testGetIssuingStore() {
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}

}
