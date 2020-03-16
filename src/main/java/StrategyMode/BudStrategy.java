package StrategyMode;

//公交车的价格计算策略
public class BudStrategy implements CalculateStrategy {
    //10公里内1元，超过10公里每5公里加收1元
    public int calculatePrice(int km) {
        int extraTotal = km -10;
        int extraFactor = extraTotal/5;
        int fraction=extraTotal%5;
        //价格计算，分段式计价
        int price=1+extraFactor*1;
        return fraction>0?++price:price;
    }
}
