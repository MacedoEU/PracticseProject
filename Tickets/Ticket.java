package Tickets;


public class Ticket {
    

private int ticketNumber; 
private String message; 
private boolean complete  = false; 

public Ticket(int ticketNumber, String message) {
    this.ticketNumber = ticketNumber; 
    this.message = message; 
    this.complete = false; 
}

public Ticket(int ticketNumber, String message, boolean complete) {
    this.ticketNumber = ticketNumber; 
    this.message = message; 
    this.complete = complete;
}

protected int getTicketNumber() {
    return this.ticketNumber; 
}

protected String getMessage() {
    return this.message; 
}

protected boolean getComplete() {
    return this.complete;     
}


protected void setComplete(boolean complete) {
    this.complete = complete; 
}







}
