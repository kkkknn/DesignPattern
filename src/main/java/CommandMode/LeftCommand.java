package CommandMode;

public class LeftCommand implements Command {
    private TetrisMachine tetrisMachine;
    public LeftCommand(TetrisMachine tetrisMachine){
        this.tetrisMachine=tetrisMachine;
    }

    public void execute() {
        tetrisMachine.toLeft();
    }
}
