package CommandMode;

public class Client {
    public static void main(String[] args) {
        TetrisMachine tetrisMachine=new TetrisMachine();

        LeftCommand leftCommand=new LeftCommand(tetrisMachine);
        RightCommand rightCommand=new RightCommand(tetrisMachine);
        FallCommand fallCommand=new FallCommand(tetrisMachine);
        TransfromCommand transfromCommand=new TransfromCommand(tetrisMachine);

        Buttons buttons=new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setTransfromCommand(transfromCommand);
        buttons.setFallCommand(fallCommand);

        buttons.fall();
        buttons.toLeft();
        buttons.toRight();
        buttons.transfrom();

    }
}
