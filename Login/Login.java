package Login;

import java.util.Scanner;

public class Login {

// this will be replaced by controller 
  public static void main(String args[]) {
    printMenuLogin(); 
} 

public static void printMenuLogin() {
    System.out.println(""); 
    System.out.println("---------------------------------");
    System.out.println("            Shop Login"); 
    System.out.println("1. User"); 
    System.out.println("2. Staff");
    System.out.println("3. Create a new Staff member ");   
    System.out.println("4. ")
    System.out.println("---------------------------------");
    decision();

}

private static void decision() {
    try { 
    Scanner sc = new Scanner(System.in); 
    System.out.println(""); 
    System.out.print("Input: ");
    int input = sc.nextInt();   

    if (input == 1) {

    }  

    else if (input == 2) {

    }

    else if (input == 3) {

    }

    } catch (Exception e) {
        System.out.println("Numerical values are only allowed please try again");
        printMenuLogin(); 
    }

}
}
