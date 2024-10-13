package client;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cli {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("(my-redis-cli)-> ");
            String inputFromConsole=scanner.nextLine();
            if(inputFromConsole.equals(""))continue;
            // Read the input from cli

            if(inputFromConsole.equalsIgnoreCase("exit")||inputFromConsole.equalsIgnoreCase("close")){
                System.out.println("Exiting the cli..");
                break;
            }

            System.out.println(inputFromConsole);

        
        }
    }
}
