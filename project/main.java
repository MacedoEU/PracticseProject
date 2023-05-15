package project;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String args[]) {
        printMenu();
    } 

    private static void printMenu() {
        System.out.println(""); 
        System.out.println("---------------------------------");
        System.out.println("             Welcome"); 
        System.out.println("1. Craete new User");
        System.out.println("2. Search User");
        System.out.println("3. Change name");
        System.out.println("4. Change age"); 
        System.out.println("5. Display Users");
        System.out.println("---------------------------------");
        decision();

    }

    private static void decision() {
        System.out.print("Input: ");
        Scanner sc = new Scanner(System.in);
        int choice =  sc.nextInt(); 
        
        if (choice == 1) {
            createNewUser();
        }
        else if (choice == 2) {
            searchUser(); 
        }

        else if (choice == 3) {
            changeName();
        }
        
        else if (choice == 4 ) {
            changeAge();
        }

        else if (choice == 5) {
            displayUsers(); 
        }

        else {
            System.out.println("");
            System.out.println("Invalid decision");
            System.out.println(""); 
            printMenu();
        }

        sc.close();

    }



    // verify login details 
    private static void createNewUser() {
        String username; 
        String name; 
        String password; 
        int age;
        
        Scanner sc = new Scanner(System.in); 
        System.out.println(""); 
        System.out.println("Create a New User ");
        System.out.println("--------------------"   ); 
        System.out.print("Please enter in a username: "); 
        username = sc.nextLine(); 

        // verifry if username exists 
        if  (Users.searchUsername(username) == false) {
            System.out.print("Please enter in a Name: ");
            name = sc.nextLine(); 
            System.out.print("Please enter in a  password (Must have at least 6 charcters): ");
            password = sc.nextLine();
     
                       if (Users.validatePassword(password) == false)  {
                             System.out.println(""); 
                             System.out.println("Password length is not 6 charcters or longer please enter in another password"); 
                             System.out.println(""); 
                             createNewUser(); 
                       }
     
                       System.out.print("Please enter in an age: ");
                       age = sc.nextInt(); 
                       Users.createNewUser(username, name, password, age);
                      
                       if (Users.validateUser(username, password) == true) {
                         System.out.println("");
                         System.out.println("User " + username + " has been added");
                         System.out.println("------------------------------------------------"); 
                         printMenu();
                       }
     
                       else {
                         System.out.println("An error has occured please try again ");
                         createNewUser(); 
                       }
     
        }  

        else if (Users.searchUsername(username) == true)  {
            System.out.println(""); 
            System.out.println("Username alreadly exists please choose another one");
            System.out.println(""); 
            createNewUser(); 
        }

      
            
            

        }
    
    

    private static void searchUser() {
    }

    private static void changeName() {
    }

    private static void changeAge() {
    }


    private static void displayUsers() {
        ArrayList<User> userArray = Users.printUser(); 


        if (userArray == null) {
            System.out.println(""); 
            System.out.println("No Users have been added to the system please add an user") ; 
            System.out.println("");
            printMenu();
        }

        System.out.println(""); 
        System.out.println("Users"); 
        System.out.println("-------------------------------------------"); 
        for (int i = 0; i < userArray.size(); i++ ) {
            System.out.print("Username: " + userArray.get(i).getUsername() + " Name: " + userArray.get(i).getName() + " Age: " +  userArray.get(i).getAge()); 
            System.out.println("");

        }

        System.out.println("-------------------------------------------"); 
        System.out.println(""); 

        printMenu();

        
    }


}
