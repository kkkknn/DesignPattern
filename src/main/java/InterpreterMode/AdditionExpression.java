package InterpreterMode;

public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }
    public int interpret() {
        int val=exp1.interpret()+exp2.interpret();
        System.out.println("+结果"+val);
        return val;
    }
}
