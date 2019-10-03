package com.bjb.enums;

/**
 * Enum for holding the exchange details.
 * 
 * @author Santosh K.
 *
 */
public enum Exchange {
	NYSE(Currency.USD), SGX(Currency.SGD);

	private Currency currency;

	Exchange(Currency currency) {
		this.currency = currency;
	}

	public Currency getCurrency() {
		return this.currency;
	}
}
