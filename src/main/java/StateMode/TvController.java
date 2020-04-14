package StateMode;

public class TvController implements PowerController {
    private TvState tvState;
    public void setTvState(TvState tvState){
        this.tvState=tvState;
    }
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机了");
    }

    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机了");
    }
    public void nextChannel(){
        tvState.nextChannel();
    }
    public void prevChannel(){
        tvState.prevChannel();
    }
    public void turnUp(){
        tvState.turnUp();
    }
    public void turnDown(){
        tvState.turnDown();
    }
}
