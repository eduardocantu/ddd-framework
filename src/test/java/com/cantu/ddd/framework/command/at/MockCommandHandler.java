package com.cantu.ddd.framework.command.at;


import com.cantu.ddd.framework.command.Command;
import com.cantu.ddd.framework.command.CommandHandler;
import com.cantu.ddd.framework.command.CommandResponse;

public class MockCommandHandler implements CommandHandler<MockCommand> {

    private Command command;

    @Override
    public CommandResponse handle(MockCommand mockCommand) {
        this.command = mockCommand;
        return CommandResponse.withResponse("");
    }

    public Command getHandledCommand() {
        return command;
    }
}

