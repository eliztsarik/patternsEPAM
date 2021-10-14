package factorymethod_command.impl;

import factorymethod_command.Command;

public class ProcCommand implements Command {
    @Override
    public void execute() {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
    }
}
