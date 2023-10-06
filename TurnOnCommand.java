package commandPattern;

public class TurnOnCommand implements Command {
    @Override
    public void execute(Device device) {
        device.turnOn();
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
