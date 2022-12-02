package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
	
	private int balance;

	public Money(int balance) {
		super();
		this.balance = balance;
	}

	public void updateBalance(Money money) {
		balance += money.balance;		
	}

	public int getBalance() {
		return balance;
	}
}
