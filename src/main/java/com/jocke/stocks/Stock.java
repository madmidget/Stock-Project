package com.jocke.stocks;


import lombok.Data;

@Data
public class Stocks {

    private final int id;
    private final String stockName;
    private final double stockPrice;
    private final boolean stockChange;

    public Stocks(int id, String stockName, double stockPrice, boolean stockChange) {

        this.id = id;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockChange = stockChange;
    }

    public int getId() { return id; }

    public String getStockName() {
        return stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public boolean getStockChange() {
        return stockChange;
    }
}
