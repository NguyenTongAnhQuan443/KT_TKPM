package fit.decorator;
import fit.strategy.TaxStrategy;

// Decorator Pattern: Base class for extending tax calculations
public abstract class TaxDecorator implements TaxStrategy {
    protected TaxStrategy wrappedTaxStrategy;

    public TaxDecorator(TaxStrategy wrappedTaxStrategy) {
        this.wrappedTaxStrategy = wrappedTaxStrategy;
    }
}
