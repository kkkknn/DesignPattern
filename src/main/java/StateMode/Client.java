package StateMode;

public class Client {
    public static void main(String[] args) {
        TvController tvController=new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.prevChannel();
        tvController.turnUp();
        tvController.powerOff();
        tvController.turnUp();
    }
}
