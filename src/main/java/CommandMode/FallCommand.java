package CommandMode;

public class FallCommand implements Command {
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    public void execute() {
        machine.fastToBottom();
    }
}
