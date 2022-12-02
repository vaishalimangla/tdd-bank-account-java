package org.xpdojo.bank;

public class Account {

	private Money balance;

	public Account(Money balance) {
		super();
		this.balance = balance;
	}

	/**
	 * Deposits the amount into the account.
	 * 
	 * @param amount - The deposit amount
	 * @return
	 */
	public Money deposit(Money amount) {
		return balance.updateBalance(amount);
	}

	/**
	 * This method returns the current account balance.
	 * 
	 * @return The balance
	 */
	public Money currentBalance() {
		return balance;
	}

	/**
	 * Withdraws the amount from the account. 
	 * 
	 * @param withdrawAmount - The amount to withdraw
	 * @return
	 */
	public Money withdraw(Money withdrawAmount) {
		return balance.updateBalance(withdrawAmount.negative());
	}
}
