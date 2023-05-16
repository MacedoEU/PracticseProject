package User;

public class User {

    private  String username; 
    private  String name; 
    private  String password; 
    private int age; 
    private double money; 

    public User(String username, String name, String password, int age, double money) {
        this.username = username; 
        this.name = name; 
        this.password = password; 
        this.age = age; 
        this.money = money;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPassword(String password) {
        this.password = password; 
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getUsername() {
        return this.username;
    }

    protected String getName() {
        return this.name;
    }

    protected String getPassword() {
        return this.password; 
    }

    protected  int getAge() {
        return this.age; 
    }

    protected double getMoney() {
        return this.money; 
    }

    
}
