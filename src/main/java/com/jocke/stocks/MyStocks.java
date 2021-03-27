package com.jocke.stocks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MyStocks {
  @JsonProperty List<Stock> data;

  public List<Stock> getData() {
    return data;
  }

  @Override
  public String toString() {
    return "MyStocks{" + "data=" + data + '}';
  }
}
