package Login;

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
    System.out.println("---------------------------------");
    decision();

}

private static void decision() {
    try { 
    System.out.println(""); 
    System.out.print("Input: ");
    } catch (Exception e) {
        System.out.println("Numerical values are only allowed please try again");
        printMenuLogin(); 
    }

}
}
