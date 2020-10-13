package AdapterMode.Class;

public class VoltAdapter extends FiveVolt.Volt220 implements FiveVolt {
    public int getVolt5() {
        return 5;
    }
}
