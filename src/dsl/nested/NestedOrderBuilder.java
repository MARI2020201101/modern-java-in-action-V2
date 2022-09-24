package dsl.nested;

class NestedOrderBuilder {
    private static Trade trade = new Trade();
    private static Stock stock = new Stock();
    public static Order order(String customer , Trade trade){
        Order order = new Order();
        order.customer = customer;
        order.addTrades(trade);
        return order;
    }
    public static Trade buy(int quantity, Stock stock,  Trade trade){
        trade.type = Trade.Type.BUY;
        trade.quantity = quantity;
        trade.stock = stock;
        return trade;
    }
    public static Stock stock(String symbol , Stock stock){
        stock.symbol = symbol;
        return stock;
    }
    public static Stock on(String market){
        stock.market = market;
        return stock;
    }
    public static Trade at(double price){
        trade.price= price;
        return trade;
    }
}
