package dsl.lambda;

import java.util.function.Consumer;

class LambdaOrderBuilder {
    private Order order = new Order();

    private LambdaOrderBuilder(){}
    public static Order order(Consumer<LambdaOrderBuilder> consumer){
        LambdaOrderBuilder builder = new LambdaOrderBuilder();
        consumer.accept(builder);
        return builder.order;
    }
    public void forCustomer(String customer){
        order.customer = customer;
    }
    public void buy(Consumer<LambdaTradeBuilder> consumer){
        trade(consumer, Trade.Type.BUY);

    }
    public void sell(Consumer<LambdaTradeBuilder> consumer){
        trade(consumer, Trade.Type.SELL);
    }
    private void trade(Consumer<LambdaTradeBuilder> consumer, Trade.Type type){
        LambdaTradeBuilder builder = new LambdaTradeBuilder(type);
        consumer.accept(builder);
        order.addTrades(builder.trade());
    }
}
class LambdaTradeBuilder {
    private Trade trade = new Trade();

    public LambdaTradeBuilder(Trade.Type type) {
        this.trade.type = type;
    }

    public Trade trade(){
        return trade;
    }
    public void quantity(int quantity){
        trade.quantity = quantity;
    }
    public void price(double price){
        trade.price = price;
    }
    public void stock(Consumer<LambdaStockBuilder> consumer){
        LambdaStockBuilder builder = new LambdaStockBuilder();
        consumer.accept(builder);
        trade.stock=builder.stock();
    }

}
class LambdaStockBuilder{
    private Stock stock = new Stock();
    public void symbol(String symbol){
        stock.symbol = symbol;
    }
    public void market(String market){
        stock.market = market;
    }
    public Stock stock(){
        return stock;
    }
}