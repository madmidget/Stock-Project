package com.jocke.stocks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Stocks {

  @JsonProperty private final String symbol;
  @JsonProperty private final String name;
  @JsonProperty private final double close;
  @JsonProperty private final String currency;
  @JsonProperty private final boolean stockChange;

  public String getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public double getClose() {
    return close;
  }

  public String getCurrency() {
    return currency;
  }

  public boolean isStockChange() {
    return stockChange;
  }

  public Stocks(String symbol, String name, double close, String currency, boolean stockChange) {
    this.symbol = symbol;
    this.name = name;
    this.close = close;
    this.currency = currency;
    this.stockChange = stockChange;
  }
}
