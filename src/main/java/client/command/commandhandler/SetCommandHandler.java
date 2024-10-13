package client.command.commandhandler;

import serialization.Serializer;

import java.util.List;

public class SetCommandHandler implements CommandHandler{

    @Override
    public void handleCommand(List<String> parameters) {

        if(!areParametersValid(parameters))return;

        String key=parameters.get(0);
        String value=parameters.get(1);

        // Serialize The Command
        String serializedInput= Serializer.serialize(parameters);

        // Send the serialized command to the server

        // Print the returned response from the server
    }

    private boolean areParametersValid(List<String> parameters){

        if(parameters==null||parameters.isEmpty()){
            System.out.println("Missing key and value");
            return false;
        }

        if(parameters.size()==1){
            System.out.println("Key should map to a value");
            return false;
        }

        if(parameters.size()>2){
            System.out.println("Key can be mapped to only one value");
            return false;
        }

        return true;
    }
}
