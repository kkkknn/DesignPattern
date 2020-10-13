package AdapterMode.Class;

public class Test {
    public static void main(String[] args) {
        VoltAdapter voltAdapter=new VoltAdapter();
        System.out.println("输出电压"+voltAdapter.getVolt5());
    }
}
