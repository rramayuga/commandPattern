package commandPattern;

public class LightDevice implements Device {
    private boolean isOn;
    private int brightness;
    private String color;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light turned off.");
    }

    @Override
    public void adjustBrightness(int level) {
        brightness = level;
        System.out.println("Brightness adjusted to: " + level);
    }

    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Color changed to: " + newColor);
    }

    public boolean isOn() {
        return isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }
}
