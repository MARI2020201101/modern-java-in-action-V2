package dsl.nested;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Order {
    List<Trade> trades = new ArrayList<>();
    String customer;
    void addTrades(Trade ...trade){
        trades.addAll(Arrays.asList(trade));
    }

    @Override
    public String toString() {
        return "Order{" +
                "trades=" + trades +
                ", customer='" + customer + '\'' +
                '}';
    }
}
