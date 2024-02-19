package fit.decorator;

import fit.strategy.TaxStrategy;

// Decorator Pattern: Adds an additional environmental tax
public class EnvironmentalTaxDecorator extends TaxDecorator {
    public EnvironmentalTaxDecorator(TaxStrategy wrappedTaxStrategy) {
        super(wrappedTaxStrategy);
    }

    @Override
    public double calculateTax(double price) {
        double baseTax = wrappedTaxStrategy.calculateTax(price);
        return baseTax + (price * 0.02); // Additional 2% environmental tax
    }
}
