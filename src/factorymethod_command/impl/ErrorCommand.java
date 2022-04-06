package factorymethod_command.impl;

import factorymethod_command.Command;

import java.util.Date;

public class ErrorCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Unknown command. Please try again");
    }
}
