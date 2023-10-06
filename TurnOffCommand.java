package commandPattern;

public class TurnOffCommand implements Command {
    @Override
    public void execute(Device device) {
        device.turnOff();
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
