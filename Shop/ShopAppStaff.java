package Shop;

import java.util.Scanner;

import User.MainUser;
import User.User;

public class ShopAppStaff {
    
    public static void main(String[] args) {
        printMenu(); 
    }

    public static void printMenu() {
        System.out.println(""); 
        System.out.println("-------------------------------");  
        System.out.println("1. Transaction a purchase"); 
        System.out.println("2. Search for a product"); 
        System.out.println("3  Reset a Password for a customer");
        System.out.println("4. Display all Transactions");
        System.out.println("5. Customer Menu");
        System.out.println("-------------------------------");  
        decision();
    }

    private static  void decision() {

        try {
            System.out.print("Input: "); 
            Scanner sc = new Scanner(System.in); 
            int choice = sc.nextInt(); 

            if (choice == 1) {
               createTransaction();
            }

            else if (choice == 2) {
                searchForProduct();
            }

            else if (choice == 3 ) {
                resetCustomerPassword(); 
            }

            else if (choice == 4) {
                displayAllTransactions();
            }

            else if (choice == 5) {
                MainUser.main(null);;
            }

            else {
                System.out.println(""); 
                System.out.println("An error has occured please try again"); 
                System.out.println("");  
                printMenu();
            }

            sc.close();
        } 
        catch (Exception e) {
            System.out.println(""); 
            System.out.println("An error has occured please try again"); 
            System.out.println("");  
            printMenu();
        }

    }

    private static void createTransaction() {
    }

    private static void searchForProduct() {
    }

    private static void resetCustomerPassword() {
    }

    private static void displayAllTransactions() {
    }





}
