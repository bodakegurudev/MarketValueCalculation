package com.bjb.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.bjb.service.PricingService;

@Service
public class PricingServiceImpl implements PricingService {

	@Override
	public BigDecimal getStockPrice(String symbol) {
		switch (symbol) {
		case "IBM":
			return new BigDecimal(143.7).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		case "DBS":
			return new BigDecimal(25.56).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		default:
			return new BigDecimal(10.50).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		}
	}

}
