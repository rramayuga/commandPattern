package commandPattern;

public class PlayPlaylistCommand implements Command {
    private String playlist;

    public PlayPlaylistCommand(String playlist) {
        this.playlist = playlist;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof MusicPlayerDevice) {
            ((MusicPlayerDevice) device).playPlaylist(playlist);
        }
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
