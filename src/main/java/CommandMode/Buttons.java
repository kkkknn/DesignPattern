package CommandMode;

public class Buttons {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransfromCommand transfromCommand;


    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }


    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }


    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }


    public void setTransfromCommand(TransfromCommand transfromCommand) {
        this.transfromCommand = transfromCommand;
    }

    public void toLeft(){
        leftCommand.execute();
    }
    public void toRight(){
        rightCommand.execute();
    }
    public void fall(){
        fallCommand.execute();
    }
    public void transfrom(){
        transfromCommand.execute();
    }


}
