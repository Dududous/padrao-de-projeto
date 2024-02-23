import Strategy.Strategy;
import Strategy.ConcreteStrategy1;
import Strategy.ConcreteStrategy2;
import Strategy.Context;


public class Main {
    public static void main(String[] args) {
        // Demonstrando o padrão Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Demonstrando o padrão Strategy
        Strategy strategy1 = new ConcreteStrategy1();
        Strategy strategy2 = new ConcreteStrategy2();

        Context context = new Context(strategy1);
        context.executeStrategy();

        context = new Context(strategy2);
        context.executeStrategy();

        // Demonstrando o padrão Facade
        Facade facade = new Facade();
        facade.operation();

        // Demonstrando o padrão Factory Method
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.operation();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.operation();
    }
}
