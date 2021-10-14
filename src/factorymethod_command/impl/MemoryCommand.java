package factorymethod_command.impl;

import factorymethod_command.Command;

public class MemoryCommand implements Command {
    @Override
    public void execute() {
        long megaBytes = 1024 * 1024;
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println(freeMemory / megaBytes);
    }
}
