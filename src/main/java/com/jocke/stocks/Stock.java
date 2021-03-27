package com.jocke.stocks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stock {
  @JsonProperty private final String symbol;
  @JsonProperty private final String name;
  @JsonProperty private final String currency;
  @JsonProperty private final String exchange;
  @JsonProperty private final String country;
  @JsonProperty private final String type;

  public Stock() {
    this(null, null, null, null, null, null);
  }

  public Stock(
      String symbol, String name, String currency, String exchange, String country, String type) {
    this.symbol = symbol;
    this.name = name;
    this.currency = currency;
    this.exchange = exchange;
    this.country = country;
    this.type = type;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public String getCurrency() {
    return currency;
  }

  public String getExchange() {
    return exchange;
  }

  public String getCountry() {
    return country;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Stock{"
        + "symbol='"
        + symbol
        + '\''
        + ", name='"
        + name
        + '\''
        + ", currency='"
        + currency
        + '\''
        + ", exchange='"
        + exchange
        + '\''
        + ", country='"
        + country
        + '\''
        + ", type='"
        + type
        + '\''
        + '}';
  }
}
