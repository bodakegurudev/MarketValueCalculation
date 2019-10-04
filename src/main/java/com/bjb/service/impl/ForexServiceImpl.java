package com.bjb.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.bjb.enums.Currency;
import com.bjb.service.ForexService;

@Service
public class ForexServiceImpl implements ForexService {

	@Override
	public BigDecimal getExchangeRate(String fromCurrency, String toCurrency) {
		if(fromCurrency.equals(Currency.USD.toString()) && toCurrency.equals(Currency.SGD.toString()))
			return new BigDecimal(1.37).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		else 
			return new BigDecimal(1.5).setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
}
