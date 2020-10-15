package DecorationMode;

//抽象装饰者
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operate() {
        component.operate();
    }
}
