package com.bjb.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

/**
 * Interface to get the forex rate
 * 
 * @author Santosh K.
 *
 */
@Service
public interface ForexService {
	public BigDecimal getExchangeRate(String fromCurrency, String toCurrency);
}
