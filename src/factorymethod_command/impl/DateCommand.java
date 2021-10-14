package factorymethod_command.impl;

import factorymethod_command.Command;

import java.util.Date;

public class DateCommand implements Command {
    @Override
    public void execute() {
        System.out.println(new Date());
    }
}
