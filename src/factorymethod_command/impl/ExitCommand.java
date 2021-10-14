package factorymethod_command.impl;

import factorymethod_command.Command;

import java.util.Date;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exit!");
        System.exit(0);
    }
}
