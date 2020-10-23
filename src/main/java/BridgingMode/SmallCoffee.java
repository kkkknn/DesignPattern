package BridgingMode;

public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    public void makeCoffee() {
        System.out.println("小杯的"+impl+"咖啡");
    }
}
