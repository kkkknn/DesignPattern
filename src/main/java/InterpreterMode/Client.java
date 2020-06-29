package InterpreterMode;

import StrategyMode.CalculateStrategy;

public class Client {
    public static void main(String[] args) {
        Calculator calculator=new Calculator("66 + 22 - 11");
        System.out.println(calculator.calculate());
    }
}
