package commandPattern;

public class ThermostatDevice implements Device {
    private boolean isOn;
    private int temperature;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat turned off.");
    }

    @Override
    public void adjustBrightness(int level) {
        // Adjusting temperature as a representation of brightness for a thermostat
        temperature = level;
        System.out.println("Temperature adjusted to: " + level);
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }
}
