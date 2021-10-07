package com.cantu.ddd.framework.command.at;

import com.cantu.ddd.framework.command.Command;
import com.cantu.ddd.framework.command.CommandBus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CommandBusShould {

    @Test
    public void callTheProperHandlerGivenTheCommandToHandle() {
        final MockCommandHandler commandHanlder = new MockCommandHandler();

        final CommandBus commandBus = new CommandBus();
        commandBus.registerHandler(commandHanlder);

        final Command command = new MockCommand();

        assertNotNull(commandBus.push(command).getResponse());
        assertEquals(command, commandHanlder.getHandledCommand());
    }


}
