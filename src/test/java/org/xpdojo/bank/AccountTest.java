package org.xpdojo.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account(new Money(500));
        account.deposit(500);
        assertThat(1000).isEqualTo(account.currentBalance());
    }
    
    @Test 
    public void withdrawAmount() {
    	Account account = new Account(new Money(500));
    	account.withdraw(100);
        assertThat(400).isEqualTo(account.currentBalance());
    }
}
