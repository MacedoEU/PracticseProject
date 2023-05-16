package KeyboardMouse;

public enum MouseType {
    
    DEATHADDER("Razer", "Deathadder V2"), 
    VIPER("Razer", "Viper");

    private final String make; 
    private final String model;
    
    MouseType(String make, String model) {
        this.make = make; 
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model; 
    }

}
