package BridgingMode;

public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    public void makeCoffee() {
        System.out.println("大杯的"+impl+"咖啡");
    }
}
