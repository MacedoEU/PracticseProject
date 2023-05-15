package project;

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

        else {
            System.out.println("");
            System.out.println("Invalid decision");
            System.out.println(""); 
            printMenu();
        }

    }


    // verify login details 
    private static void createNewUser() {
        Scanner sc = new Scanner(System.in); 
         
    
    }

    private static void searchUser() {
    }

    private static void changeName() {
    }

    private static void changeAge() {
    }


}
