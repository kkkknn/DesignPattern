package AdapterMode.Object;

public class Test {
    public static void main(String[] args) {
        VoltAdapter voltAdapter=new VoltAdapter(new Volt220());
        System.out.println("输出电压"+voltAdapter.getVolt5());
    }
}
