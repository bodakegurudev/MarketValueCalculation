package com.bjb.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

public interface MarketValueService {
	/**
	 * Method to return the market value of an account based on input account ID
	 * 
	 * @param accountId
	 * @return market value
	 */
	public BigDecimal getMarketValue(long accountId);
}
