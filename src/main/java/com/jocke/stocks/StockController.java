package com.jocke.stocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StockController {

  private StockService stockService;

  @Value("${api.key}")
  private String apikey;

  @Autowired private RestTemplate restTemplate;
  private static String url = "https://api.twelvedata.com/stocks";
  private final String batchUrl = "https://api.twelvedata.com/time_series?symbol=AAPL,EUR/USD,ETH/BTC:Huobi,RY:TSX&interval=1min&apikey=38645e2aa4a5474099683582d319c075";


  @GetMapping(value = "/stocks")
  public List<Stock> getStocks(){

    return stockService.findAll();
  }
  @GetMapping(value = "/stocks/countries")
  public List<String> getCountry() {

    return stockService.findCountries();
  }

  @GetMapping(value = "/stocks/symbol")
  public List<String> getSymbol() {
    return stockService.findSymbols();
  }

  public StockController(StockService stockService) {
    this.stockService = stockService;
  }
}
