package dsl.builder;

class Stock {
    String symbol;
    String market;

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", market='" + market + '\'' +
                '}';
    }
}
