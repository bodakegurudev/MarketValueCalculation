package com.bjb.service.impl;

import java.math.BigDecimal;

import com.bjb.service.ForexService;

public class ForexServiceImpl implements ForexService {

	@Override
	public BigDecimal getExchangeRate(String fromCurrency, String toCurrency) {
		return new BigDecimal(1.35);
	}

}
