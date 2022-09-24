package dsl.builder;

class OrderBuilder {
    private Order order = new Order();

    public TradeBuilder forCustomer(String customer){
        order.customer = customer;
        return new TradeBuilder(this, order);
    }

    public Order end(){
        return order;
    }
}
class TradeBuilder{
    private OrderBuilder builder;
    private Trade trade = new Trade();
    private Order order;
    public TradeBuilder(OrderBuilder orderBuilder, Order order) {
        this.builder = orderBuilder;
        this.order = order;
    }
    public TradeBuilder buy(int quantity){
        trade.type= Trade.Type.BUY;
        trade.quantity = quantity;
        return this;
    }
    public StockBuilder stock(String symbol){
        return new StockBuilder(builder, order, trade, symbol);
    }

}
class StockBuilder{
    private Stock stock = new Stock();
    private OrderBuilder builder;
    private Order order;
    private Trade trade;

    public StockBuilder(OrderBuilder orderBuilder, Order order, Trade trade, String symbol) {
        this.stock.symbol = symbol;
        this.builder = orderBuilder;
        this.order = order;
        this.trade = trade;
    }

    public TradeBuilderWithStock on(String market){
        this.stock.market = market;
        trade.stock = stock;
        return new TradeBuilderWithStock(builder,order,trade);
    }
}
class TradeBuilderWithStock{
    private OrderBuilder builder;
    private Order order;
    private Trade trade;

    public TradeBuilderWithStock(OrderBuilder builder, Order order, Trade trade) {
        this.builder = builder;
        this.order = order;
        this.trade = trade;
    }

    public OrderBuilder at(double price){
        trade.price=price;
        order.addTrades(trade);
        return builder;
    }
}