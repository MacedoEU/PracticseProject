package project;

public class User {

    private  String username; 
    private  String name; 
    private  String password; 
    private  int age; 

    public User(String username, String name, String password, int age) {
        this.username = username; 
        this.name = name; 
        this.password = password; 
        this.age = age; 
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setPassword(String password) {
        this.password = password; 
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    protected String getPassword() {
        return this.password; 
    }

    protected  int getAge() {
        return this.age; 
    }

    
}
