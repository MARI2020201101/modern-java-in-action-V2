package dsl.builder;

public class Demo {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .forCustomer("BigBank")
                .buy(80)
                .stock("IBM")
                .on("NYSE")
                .at(125.00)
                .end();
        System.out.println(order);

    }
}
