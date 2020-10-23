package BridgingMode;

public class Test {
    public static void main(String[] args) {
        //原汁原味
        Ordinary ordinary=new Ordinary();
        //准备糖类
        Sugar sugar=new Sugar();

        //大杯咖啡，原味
        LargeCoffee coffee1=new LargeCoffee(ordinary);
        coffee1.makeCoffee();
        //小杯咖啡，原味
        SmallCoffee coffee2=new SmallCoffee(ordinary);
        coffee2.makeCoffee();

        //大杯咖啡，加糖
        LargeCoffee largeCoffee=new LargeCoffee(sugar);
        largeCoffee.makeCoffee();
        //小杯咖啡，加糖
        SmallCoffee smallCoffee=new SmallCoffee(sugar);
        smallCoffee.makeCoffee();

    }
}
