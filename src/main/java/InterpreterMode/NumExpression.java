package InterpreterMode;

public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    public int interpret() {
        return num;
    }
}
