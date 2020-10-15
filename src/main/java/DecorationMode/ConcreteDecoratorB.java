package DecorationMode;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    @Override
    public void operate() {
        opearteB();
        super.operate();
    }

    public void opearteB(){
        System.out.println("自定义的装饰方法B");
    }
}
