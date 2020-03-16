package StrategyMode;

public class TranficCalculator {
    public static void main(String[] args) {
        TranficCalculator tranficCalculator=new TranficCalculator();
        //设置策略
        tranficCalculator.setCalculateStrategy(new BudStrategy());
        int price=tranficCalculator.calculatePrice(16);
        System.out.println("公交车乘坐16公里的价格"+price);
    }
    CalculateStrategy mCalculateStrategy;
    public void setCalculateStrategy(CalculateStrategy calculateStrategy){
        this.mCalculateStrategy=calculateStrategy;
    }
    public int calculatePrice(int km){
        return mCalculateStrategy.calculatePrice(km);
    }
}
