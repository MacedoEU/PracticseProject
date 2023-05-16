package KeyboardMouse;

public enum KeyboardType {
    

    CYONSA("Razer", "CYNOSA"), 
    BLACKWIDOW("Razer", "BlackWidow"), 
    ORNATA("Razer", "Oranata"), 

    LIGHTSPEED("Logitech", "Lightspeed"), 
    ORION("Logitech", "Orion Spectrum"), 
    TKL("Logitech", "G Pro"); 

    private final String make; 
    private final String model; 


    KeyboardType(String make, String model) {
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

