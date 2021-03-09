package com.jocke.stocks;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService implements IStockService {

    private final RestTemplate restTemplate;

    public StockService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Stocks> findAll() {
       /*
        return Stream.of(new Stocks(1, "stock-1", 1.1, false),
                new Stocks(2, "stock-2", 2.2, true))
              .collect(Collectors.toList());
*/
        //restTemplate.getForEntity("https://stock-api.com", Stocks[].class);

        ArrayList<Stocks> stocks = new ArrayList<>();
        stocks.add(new Stocks(1, "stock-1", 1.1, false));
        stocks.add(new Stocks(2, "stock-2", 2.2, true));
        return stocks;
    }
}

