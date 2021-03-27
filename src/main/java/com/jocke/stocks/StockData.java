
package com.jocke.stocks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockData {
  @JsonProperty private final List<Stocks> data;

  public StockData(List<Stocks> stockData) {
    this.data = stockData;
  }

  public List<Stocks> getData() {
    return data;
  }
}
