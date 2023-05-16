package Controller;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import javax.script.ScriptException;

import User.MainUser;

public class Controller {
    
    public static void main(String args[]) throws ScriptException, IOException  {
        System.out.println("");
        callWelcome(); 
        MainUser.printMenu();
    } 


    private static void callWelcome() throws ScriptException, IOException {
        String s = null;

        try {
            
            Process p = Runtime.getRuntime().exec("python Controller/WelcomeMessage.py");
    
            
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));

          
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            
    
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            
        }
        catch (IOException e) {
            System.out.println("exception ");
            e.printStackTrace();
            System.exit(-1);
        }
    }


}


