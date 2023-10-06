package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class DeviceController {
    private List<Command> commands;

    public DeviceController() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommands(Device device) {
        for (Command command : commands) {
            command.execute(device);
        }
    }
}
