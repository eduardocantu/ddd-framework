package com.cantu.ddd.framework.command;

public interface CommandHandler<K extends Command> {

    CommandResponse handle(K command);
}
