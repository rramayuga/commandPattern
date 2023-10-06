package commandPattern;

public class SetTemperatureCommand implements Command {
    private int temperature;

    public SetTemperatureCommand(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof ThermostatDevice) {
            ((ThermostatDevice) device).adjustBrightness(temperature);
        }
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
