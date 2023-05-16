package Staff;

public class Staff {
 
    private String name; 
    private Position role; 

    public Staff (String name, Position role) {
        this.name = name; 
        this.role = role; 
    }

    protected String getName() {
        return this.name; 
    }

    protected  Position getPosition() {
        return this.role; 
    }

    protected void setName(String name) {
        this.name = name;  
    }

    protected void setRole(Position role) {
        this.role = role;
    }

}
