package com.bjb.resource;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bjb.service.MarketValueService;

@RestController
@RequestMapping("/v1")
public class MarketValueResource {

	@Autowired
	MarketValueService marketValueService;
	
	@GetMapping("/marketValue")
	public BigDecimal getMrketValue(HttpServletRequest request, @RequestParam long accountId)
			throws Exception {
		return marketValueService.getMarketValue(accountId);
	}
	
}
