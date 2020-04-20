package InterpreterMode;

import java.util.Stack;

public class Calculator {
    //声明一个Strack栈
    private Stack<ArithmeticExpression> stack=new Stack<ArithmeticExpression>();

    public Calculator(String express) {
        //声明2个变量，临时存储运算符左右两边的数字解释器
        ArithmeticExpression expression1,expression2;
        //根据空格分割字符串
        String[] args=express.split(" ");
        //循环数组
        for (int i = 0; i <args.length ; i++) {
            switch (args[i].charAt(0)){
                case '+'://如果是+号
                    expression1=stack.pop();
                    expression2=new NumExpression(Integer.valueOf(args[++i]));
                    stack.push(new AdditionExpression(expression1,expression2));
                    break;
                default: //如果为数字
                    stack.push(new NumExpression(Integer.valueOf(args[i])));
                    break;
            }
        }
    }

    public int calculate(){
        return stack.pop().interpret();
    }
}
