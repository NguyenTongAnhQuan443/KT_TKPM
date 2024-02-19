package fit.product;

import fit.strategy.TaxStrategy;

// State Pattern: Allows dynamic assignment of TaxStrategy to Product
public class Product {
    private String name;
    private double basePrice;
    private TaxStrategy taxStrategy;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateFinalPrice() {
        double tax = taxStrategy != null ? taxStrategy.calculateTax(basePrice) : 0;
        return basePrice + tax;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Base Price: " + basePrice;
    }
}
