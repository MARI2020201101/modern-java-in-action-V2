package dsl.lambda;

import static dsl.lambda.LambdaOrderBuilder.order;

class Demo {
    public static void main(String[] args) {
        Order order = order(o -> {
            o.forCustomer("BigBank");
            o.buy(t -> {
                    t.quantity(80);
                    t.price(125.00);
                    t.stock(s -> {
                        s.symbol("IBM");
                        s.market("NYSE");
                    });
                    }
            );
            o.sell(t -> {
                    t.quantity(50);
                    t.price(375.00);
                    t.stock(s->{
                        s.symbol("GOOGLE");
                        s.market("NASDAQ");
                });
            });
        });
        System.out.println(order);
    }
}
