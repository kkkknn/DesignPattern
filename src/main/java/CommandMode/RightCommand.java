package CommandMode;

public class RightCommand implements Command {
    private TetrisMachine tetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    public void execute() {
        tetrisMachine.toRight();
    }
}
