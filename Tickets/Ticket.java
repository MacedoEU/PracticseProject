package Tickets;

// user can raise ticket to reset their  password
// only admin roles can view 

public class Ticket {
    

private int ticketNumber; 
private String message; 
private boolean complete  = false; 

public Ticket(int ticketNumber, String message, boolean complete) {
    this.ticketNumber = ticketNumber; 
    this.message = message; 
    this.complete = complete;
}


protected int getTicket() {
    return this.ticketNumber; 
}

protected String getMessage() {
    return this.message; 
}





}
