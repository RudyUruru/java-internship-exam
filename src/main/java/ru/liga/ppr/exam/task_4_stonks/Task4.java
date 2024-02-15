package ru.liga.ppr.exam.task_4_stonks;

import java.util.HashMap;
import java.util.List;

public class Task4 {

    public boolean checkEquals(List<String> stocks1, List<String> stocks2)  {
        var mapOfStocks1 = new HashMap<String, Integer>();
        var mapOfStocks2 = new HashMap<String, Integer>();
        for (String stock : stocks1) {
            mapOfStocks1.put(stock, mapOfStocks1.getOrDefault(stock, 0) + 1);
        }
        for (String stock : stocks2) {
            mapOfStocks2.put(stock, mapOfStocks2.getOrDefault(stock, 0) + 1);
        }
        return mapOfStocks1.equals(mapOfStocks2);
    }

    /*public void fillMapOfStocks(List<String> stocks, HashMap<String, Integer> mapOfStocks) {
        for (String stock : stocks) {
            mapOfStocks.put(stock, mapOfStocks.getOrDefault(stock, 0)+1);
        }
    }*/
}
