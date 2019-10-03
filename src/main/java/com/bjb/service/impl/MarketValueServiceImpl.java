package com.bjb.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.bjb.dto.Account;
import com.bjb.dto.Stock;
import com.bjb.service.AccountService;
import com.bjb.service.ForexService;
import com.bjb.service.MarketValueService;
import com.bjb.service.PricingService;

public class MarketValueServiceImpl implements MarketValueService {

	@Autowired
	ForexService forexService;

	@Autowired
	PricingService pricingService;

	@Autowired
	AccountService accountService;

	@Override
	public BigDecimal getMarketValue(long accountId) {
		Account account = accountService.getAccountById(accountId).get();
		return account.getStocks().stream().map(s -> getValueForAStock(s)).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	/**
	 * Method to calculate the stock price
	 * @param stock
	 * @return stock value
	 */
	private BigDecimal getValueForAStock(Stock stock) {
		if (stock.getExchange().getCurrency() != stock.getAccount().getBaseCurrency())
			return new BigDecimal(stock.getQuantity()).multiply(pricingService.getStockPrice(stock.getSymbol()));
		else
			return new BigDecimal(stock.getQuantity()).multiply(pricingService.getStockPrice(stock.getSymbol()))
					.multiply(forexService.getExchangeRate(stock.getExchange().getCurrency().toString(),
							stock.getAccount().getBaseCurrency().toString()));
	}
}
