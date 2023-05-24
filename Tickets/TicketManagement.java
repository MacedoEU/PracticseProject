package Tickets;

import java.util.ArrayList;

public class TicketManagement {
    
    private static ArrayList <Ticket>  tickets = new ArrayList<Ticket>(); 


    // create new Ticket
    // set compleation 
    // search ticket 
    // return all tickets 


    public boolean createNewTicket(int ticketNumber, String message) {

        try {
                if (ticketNumber >= 0 && message != null) {
                    Ticket ticket = new  Ticket(ticketNumber, message);
                    tickets.add(ticket);
                    return true;
                } 
                else {
                    return false; 
                }
        } 
        
        catch (Exception e) {
            return false; 
        }


    }
    public boolean setComplete(int ticketNumber, boolean complete) {

        try {

            if (ticketNumber < 0 ) {
                return false;
            }

            for (int i = 0; i < tickets.size(); i++) {
                if (tickets.get(i).getTicketNumber() == ticketNumber)  {
                    tickets.get(i).setComplete(complete);
                    return true; 
                }
            }

            return false;

        } catch (Exception e) {
            return false; 
        }

    }

    public Ticket searchTicket(int ticketNumber) {
        try {

            if (ticketNumber < 0 ) {
                return null;
            }

            for (int i = 0; i < tickets.size(); i++) {
                if (tickets.get(i).getTicketNumber() == ticketNumber)  {
                    tickets.get(i);
                }
            }

            return null;

        } catch (Exception e) {
            return null; 
        }
    }


    
public ArrayList<Ticket> searchTicket() {

    try {
        if (tickets.size() < 0) {
            return null;
        }

        else {
            return tickets;
        }

    } catch(Exception e) {
        return null;
    }


}



}


