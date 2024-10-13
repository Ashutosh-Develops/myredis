package serialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Serialization {

    @Test
    public void serializeSuccessfullyWhenParameterListIsNull(){

        List<String> parameters=null;
        String actualSerializedInput=Serializer.serialize(parameters);
        String expectedSerializedInput="*-1\\r\\n";

        Assertions.assertEquals(expectedSerializedInput,actualSerializedInput);

    }

    @Test
    public void serializeSuccessfullyWhenParameterListIsEmpty(){

        List<String> parameters=new ArrayList<>();
        String actualSerializedInput=Serializer.serialize(parameters);
        String expectedSerializedInput="*0\\r\\n\\r\\n";

        Assertions.assertEquals(expectedSerializedInput,actualSerializedInput);
    }

    @Test
    public void serializeSuccessfullyWhenParameterListContainsOnlyCommandWithNoArguments(){

        List<String> commandWithoutArguments= Arrays.asList("INFO");

        String actualSerializedInput=Serializer.serialize(commandWithoutArguments);
        String expectedSerializedInput="*1\\r\\n$4\\r\\nINFO\\r\\n";

        Assertions.assertEquals(expectedSerializedInput,actualSerializedInput);
    }

    @Test
    public void serializeSuccessfullyWhenParameterListContainsCommandAndArguments(){

        List<String> commandWithArguments= Arrays.asList("ECHO","Hello World");

        String actualSerializedInput=Serializer.serialize(commandWithArguments);
        String expectedSerializedInput="*2\\r\\n$4\\r\\nECHO\\r\\n$11\\r\\nHello World\\r\\n";

        Assertions.assertEquals(expectedSerializedInput,actualSerializedInput);
    }


}
