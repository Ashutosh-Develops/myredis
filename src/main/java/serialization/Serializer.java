package serialization;

import java.util.List;

public class Serializer {

    public static String serialize(List<String> args){
        return serializeAsArray(args);
    }

    private static String serializeAsArray(List<String> args){

        StringBuilder serializedString=new StringBuilder();

        // when args is null
        if(args==null){
            serializedString.append("*-1\\r\\n");
        }else if(args.isEmpty()){
            serializedString.append("*0\\r\\n\\r\\n");
        }else{  // args.size()>0
            serializedString.append("*"+args.size()+"\\r\\n");
            for(String argument:args){
                int len=argument.length();
                serializedString.append("$"+len+"\\r\\n"+argument+"\\r\\n");
            }
        }

        return serializedString.toString();
    }
}
