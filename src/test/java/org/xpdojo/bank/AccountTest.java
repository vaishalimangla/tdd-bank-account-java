package org.xpdojo.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

	private Account account;

	@BeforeEach
	public void setUp() {
		account = new Account(Money.amountOf(500));
	}

	@Test
	public void depositAnAmountToIncreaseTheBalance() {
		Money blanaceAfterDeposit = account.deposit(Money.amountOf(500));
		assertThat(Money.amountOf(1000)).isEqualTo(blanaceAfterDeposit);
	}

	@Test
	public void withdrawAmount() {
		Money blanaceAfterWithdraw = account.withdraw(Money.amountOf(100));
		assertThat(Money.amountOf(400)).isEqualTo(blanaceAfterWithdraw);
	}
	
	@Test 
    public void transferAmountToAnotherAccount() {
        Account destinationAccount = new Account(Money.amountOf(500));       
        account.transfer(Money.amountOf(100), destinationAccount);
        
        assertThat(Money.amountOf(400)).isEqualTo(account.currentBalance());
        assertThat(Money.amountOf(600)).isEqualTo(destinationAccount.currentBalance());
    }
}
