package com.bjb.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

/**
 * Pricing Service
 * 
 * @author Santosh K.
 *
 */
public interface PricingService {
	public BigDecimal getStockPrice(String symbol);
}
