package commandPattern;

public class MusicPlayerDevice implements Device {
    private boolean isOn;
    private String currentPlaylist;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Music player turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Music player turned off.");
    }

    @Override
    public void adjustBrightness(int level) {
        // Adjusting volume as a representation of brightness for a music player
        System.out.println("Volume adjusted to: " + level);
    }

    public void playPlaylist(String playlist) {
        currentPlaylist = playlist;
        System.out.println("Playing playlist: " + playlist);
    }

    public boolean isOn() {
        return isOn;
    }

    public String getCurrentPlaylist() {
        return currentPlaylist;
    }
}
