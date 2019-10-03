package com.bjb.service.impl;

import java.math.BigDecimal;

import com.bjb.service.PricingService;

public class PricingServiceImpl implements PricingService {

	@Override
	public BigDecimal getStockPrice(String symbol) {
		return new BigDecimal(125.50);
	}

}
