package com.jocke.stocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController
{
    @Autowired
    private IStockService stockService;
    @GetMapping(value = "/stocks")
    public List<Stocks> getStocks()
    {
        List<Stocks> stocks = stockService.findAll();
        return stocks;
    }
}
//En del av min server som anropar stocks api