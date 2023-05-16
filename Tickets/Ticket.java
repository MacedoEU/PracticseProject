package Tickets;

// user can raise ticket to reset their  password
// only admin roles can view 

public class Ticket {
    

private String username; 
private String password; 

public Ticket(String username, String password) {
    this.username = username; 
    this.password = password; 
}

}
