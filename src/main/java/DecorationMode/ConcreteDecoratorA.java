package DecorationMode;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
    }

    public void operateA(){
        //装饰方法逻辑
        System.out.println("装饰方法罗技");
    }
}
