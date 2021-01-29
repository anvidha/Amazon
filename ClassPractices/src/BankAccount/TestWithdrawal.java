package BankAccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWithdrawal {

	@Test
	void test() {
		//fail("Not yet implemented");
		Account acc = new Account();
		double bal = acc.balance;
		double withdrw = acc.withdrawRead();
		double withdrawalAmtExp =0.0;
		if(bal>withdrw) {
			 withdrawalAmtExp =  bal-withdrw;
			
		    }
		
		double withdrawalAct = acc.withdrawalAmt(withdrw, bal);
		 System.out.println("expected "+withdrawalAmtExp);
		System.out.println("actual "+withdrawalAct);
		assertEquals(withdrawalAmtExp,withdrawalAct);
		
		
	}
	
	void testLoan() {
		Account acc1 = new Account();
		int tenure = 4;
		int rate = 5;
		double principalAmt = 20000;
		
		
		
//		double principalAmt = 
		
	}

}
