package commandPattern;

public class AdjustSpeedCommand implements Command {
    private FanDevice fan;
    private int speedLevel;

    public AdjustSpeedCommand(FanDevice fan, int speedLevel) {
        this.fan = fan;
        this.speedLevel = speedLevel;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof FanDevice) {
            fan.adjustBrightness(speedLevel);
        } else {
            System.out.println("Cannot adjust speed on this device.");
        }
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}