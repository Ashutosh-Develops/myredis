package client.command;

import client.command.commandhandler.CommandHandler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommandProcessorInstance implements CommandProcessor{

    private Map<String, CommandHandler> commandMap;

    public CommandProcessorInstance() {
        this.commandMap = getCommandHandlers();
    }

    @Override
    public void processCommand(String command) {
        if(command==null||command.equals(""))return;
    }

    private Map<String,CommandHandler> getCommandHandlers(){
        Map<String,CommandHandler> map=new HashMap<>();
        // Later add command handlers
        return map;
    }

}
