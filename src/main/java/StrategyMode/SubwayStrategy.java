package StrategyMode;


//地铁的价格计算策略
public class SubwayStrategy implements CalculateStrategy {
    public int calculatePrice(int km) {
        //6公里内3元，6~12 4元  12~22 5元  22~32 6元
        if(km<=6){
            return 3;
        }else if(km>6&&km<12){
            return 4;
        }else if(km>12&&km<22){
            return 5;
        }else if(km>22&&km<32){
            return 6;
        }
        //其他距离简化7元
        return 7;
    }
}
