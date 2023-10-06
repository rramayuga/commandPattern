package commandPattern;

public class ChangeChannelCommand implements Command {
    private TVDevice tv;
    private int channel;

    public ChangeChannelCommand(TVDevice tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof TVDevice) {
            tv.changeChannel(channel);
        } else {
            System.out.println("Cannot change channel on this device.");
        }
    }

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}