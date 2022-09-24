package dsl.lambda;

class Trade {
    Type type;
    Stock stock;
    int quantity;
    double price;

    public enum Type{
        BUY, SELL;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "type=" + type +
                ", stock=" + stock +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
