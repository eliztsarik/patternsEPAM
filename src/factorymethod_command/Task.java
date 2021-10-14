package factorymethod_command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {

    public static void main(String[] args) throws IOException {
        CommandFactory commandFactory;

        {
            commandFactory = new CommandFactory();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String command = reader.readLine();
                commandFactory.createCommand(command).execute();

            }
        }
    }
}
