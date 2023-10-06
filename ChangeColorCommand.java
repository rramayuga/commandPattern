package commandPattern;

public class ChangeColorCommand implements Command {
    private String color;

    public ChangeColorCommand(String color) {
        this.color = color;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof LightDevice) {
            ((LightDevice) device).changeColor(color);
        }
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
