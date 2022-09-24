package dsl.nested;

import static dsl.nested.NestedOrderBuilder.*;

class Demo {
    public static void main(String[] args) {
        Order order = order(
                "BigBank"
                , buy(80
                        , stock("IBM"
                                , on("NYSE"))
                        , at(125.00))
                );
        System.out.println(order);
    }
}
