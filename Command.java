package commandPattern;

public interface Command {
    void execute();
    void undo();
	void execute(Device device);
}
