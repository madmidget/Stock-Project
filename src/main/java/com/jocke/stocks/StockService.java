package com.jocke.stocks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {

  private final RestTemplate restTemplate;
  private final String stockUrl;
  private final String batchUrl =
      "https://api.twelvedata.com/time_series?symbol=AAPL,EUR/USD,ETH/BTC:Huobi,RY:TSX&interval=1min&apikey=38645e2aa4a5474099683582d319c075";
  private final String apiKey;

  public StockService(
      RestTemplate restTemplate,
      @Value("${stock.api.url}") String stockUrl,
      @Value("${api.key}") String apiKey) {
    this.restTemplate = restTemplate;
    this.stockUrl = stockUrl;
    this.apiKey = apiKey;
  }

  public List<Stock> findAll() {

    MyStocks stocks = restTemplate.getForObject(stockUrl, MyStocks.class);
    System.out.println(stocks);

    return stocks.getData();
  }

  public List<String> findCountries() {
    MyStocks myStocks = restTemplate.getForObject(stockUrl, MyStocks.class);
    List<Stock> stockList = myStocks.getData();
    List<String> countries =
        stockList.stream().map(stock -> stock.getCountry()).collect(Collectors.toList());
    return countries;
  }

  public List<String> findSymbols() {
    StockData stockData = restTemplate.getForObject(batchUrl, StockData.class);
    System.out.println(stockData);
    List<Stocks> stocksList = stockData.getData();
    List<String> symbol =
        stocksList.stream().map(stocks -> stocks.getSymbol()).collect(Collectors.toList());
    return symbol;
  }
}
