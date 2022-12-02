package org.xpdojo.bank;


public class Account {

	private Money money;

	public Account(Money money) {
		super();
		this.money = money;
	}

	public void deposit(int amount) {
		money.updateBalance(new Money(amount));
	}

	public int currentBalance() {
		return money.getBalance();
	}
}
