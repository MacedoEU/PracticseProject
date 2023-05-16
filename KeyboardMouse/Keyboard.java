package KeyboardMouse;

public class Keyboard {
    
    private int id; 
    private KeyboardType keyboardType;
    private double price;
    private Quality quality;


    // id - keyboard Type -- price -- QUALITY 
    public Keyboard(int id, KeyboardType keyboardType, double price, Quality quality ) {
        this.id = id; 
        this.keyboardType = keyboardType; 
        this.price = price; 
        this.quality = quality; 
    }

    


}
