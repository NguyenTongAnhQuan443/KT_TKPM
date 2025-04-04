package abstract_factory;

class ConcreteFactory implements Factory {
    public ProductA createProductA() {
        return new ConcreteProductA();
    }

    public ProductB createProductB() {
        return new ConcreteProductB();
    }
}