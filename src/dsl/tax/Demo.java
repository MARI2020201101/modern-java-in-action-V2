package dsl.tax;

class Demo {
    public static void main(String[] args) {
        double valueWithTax = new TaxCalculator()
                .with(Tax::general)
                .with(Tax::regional)
                .with(Tax::surcharge)
                .calculate(100);
        System.out.println(valueWithTax);
    }
}
