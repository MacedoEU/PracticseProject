package Staff;

public class Staff {
 
    private String username; 
    private String name; 
    private Position role; 
    private String password; 

    public Staff (String username, String name, Position role, String password) {
        this.username = username;
        this.name = name; 
        this.role = role; 
        this.password = password; 
    }

    protected String getUsername () {
        return this.username;
    }

    protected String getName() {
        return this.name; 
    }

    protected  Position getPosition() {
        return this.role; 
    }

    protected String getPassword() {
        return this.password; 
    }

    protected void setName(String name) {
        this.name = name;  
    }

    protected void setRole(Position role) {
        this.role = role;
    }

    protected void setPassword(String password) {
            this.password = password; 
    }

}
