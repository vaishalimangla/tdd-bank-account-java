package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept. This class should have no
 * accessor methods.
 */
public class Money {

	private int amount;

	public Money(int amount) {
		super();
		this.amount = amount;
	}

	public static Money amountOf(int value) {
		return new Money(value);
	}

	public Money updateBalance(Money money) {
		return amountOf(this.amount + money.amount);
	}

	public Money negative() {
		return amountOf(-amount);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
}
