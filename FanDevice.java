package commandPattern;

public class FanDevice implements Device {
    private boolean isOn;
    private int speedLevel;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan turned off.");
    }

    @Override
    public void adjustBrightness(int level) {
        speedLevel = level;
        System.out.println("Fan speed adjusted to: " + level);
    }
    
    public boolean isOn() {
        return isOn;
    }

    public int getSpeedLevel() {
        return speedLevel;
    }
}
