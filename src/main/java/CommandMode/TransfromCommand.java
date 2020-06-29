package CommandMode;

public class TransfromCommand implements Command {
    private TetrisMachine tetrisMachine;

    public TransfromCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    public void execute() {
        tetrisMachine.transfrom();
    }
}
