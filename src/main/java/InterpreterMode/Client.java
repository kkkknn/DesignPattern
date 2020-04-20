package InterpreterMode;

import StrategyMode.CalculateStrategy;

public class Client {
    public static void main(String[] args) {
        Calculator calculator=new Calculator("11 + 22 + 22 + 33");
        System.out.println(calculator.calculate());
    }
}
