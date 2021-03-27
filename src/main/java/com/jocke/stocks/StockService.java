package com.jocke.stocks.Service;

import com.jocke.stocks.MyStocks;
import com.jocke.stocks.Stocks;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StockService {

  private final RestTemplate restTemplate;
  private final String stockUrl;
  private final String apiKey;

  public StockService(
      RestTemplate restTemplate,
      @Value("${stock.api.url}") String stockUrl,
      @Value("${api.key}") String apiKey)
      throws IOException {
    this.restTemplate = restTemplate;
    this.stockUrl = stockUrl;
    this.apiKey = apiKey;
  }

  // private static String url =
  //
  // "https://api.twelvedata.com/time_series?symbol=TSLA&interval=1min&outputsize=12&apikey=38645e2aa4a5474099683582d319c075";

  public List<Stocks> findAll() {

    MyStocks stocks = restTemplate.getForObject(stockUrl, MyStocks.class);

    System.out.println(stocks);
    return Stream.of(new Stocks(1, "stock-1", 1.1, false), new Stocks(2, "stock-2", 2.2, true))
        .collect(Collectors.toList());
  }

  Object parse(st)
}
