package Staff;

public enum Position {
    

    FULL_TIME("Full Time", 100), 
    PART_TIME("Part Time", 50), 
    ADMIN("Admin", 110); 

    private final String role; 
    private final double salary; 


    Position(String role, double salary) {
        this.role = role; 
        this.salary = salary; 
    }

    public String getRole() {
        return this.role; 
    }

    public double getSalary() {
        return this.salary; 
    }

}
