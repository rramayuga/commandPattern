package commandPattern;

public class AdjustBrightnessCommand implements Command {
    private int brightnessLevel;

    public AdjustBrightnessCommand(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }
    
    @Override
    public void execute(Device device) {
        device.adjustBrightness(brightnessLevel);
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
