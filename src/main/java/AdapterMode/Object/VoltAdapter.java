package AdapterMode.Object;

public class VoltAdapter implements FiveVolt {
    Volt220 volt220;
    public VoltAdapter(Volt220 adaptee){
        volt220=adaptee;
    }
    public int getVolt220(){
        return volt220.getVolt220();
    }

    public int getVolt5() {
        return 5;
    }
}
