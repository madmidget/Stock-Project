package com.jocke.stocks;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@SpringBootTest
class StockServiceTest {

  RestTemplate restTemplate;

  @Autowired
  StockService stockService;

  @Test
  @DisplayName("findAll method")
  void findAll() {

    final Stocks stocks = new Stocks("AAPL", "apple", 292.64999, "USD", true);

    assertAll(
        () -> assertEquals("AAPL", stocks.getSymbol()),
        () -> assertEquals("apple", stocks.getName()),
        () -> assertEquals(292.64999, stocks.getClose()),
        () -> assertEquals("USD", stocks.getCurrency()));
  }

  @Test
  public void getCountry() {

    System.out.println(stockService.findCountries());
  }

  @Test
  @DisplayName("CheckIfChanged")
  void ifChanged() {}



}
