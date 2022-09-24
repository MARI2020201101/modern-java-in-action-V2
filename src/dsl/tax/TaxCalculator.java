package dsl.tax;

import java.util.function.DoubleUnaryOperator;

class TaxCalculator {
    public DoubleUnaryOperator taxFunction = d->d;

    public double calculate(double value){
        return taxFunction.applyAsDouble(value);
    }
    public TaxCalculator with(DoubleUnaryOperator next){
        taxFunction = taxFunction.andThen(next);
        return this;
    }
}
