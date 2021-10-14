package factorymethod_command;

import factorymethod_command.impl.*;

import java.util.Map;

public class CommandFactory {

    private static final ErrorCommand ERROR_COMMAND = new ErrorCommand();

    private final Map<String, Command> commandMap = Map.of(
            "date", new DateCommand(),
            "mem", new MemoryCommand(),
            "proc", new ProcCommand(),
            "exit", new ExitCommand()
    );

    public Command createCommand(String input) {
        return commandMap.getOrDefault(input, ERROR_COMMAND);
    }
}
