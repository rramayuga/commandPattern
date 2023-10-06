package commandPattern;

public class TVDevice implements Device {
    private boolean isOn;
    private int volumeLevel;
    private int channel;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("TV turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("TV turned off.");
    }

    @Override
    public void adjustBrightness(int level) {
        volumeLevel = level;
        System.out.println("Volume adjusted to: " + level);
    }

    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel changed to: " + channel);
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getChannel() {
        return channel;
    }
}
