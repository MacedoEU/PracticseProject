package KeyboardMouse;

public class Keyboard {
    
    private int keyboardId; 
    private KeyboardType keyboardType;
    private double price;
    private Quality quality;
    private int qty; 


    // id - keyboard Type -- price -- QUALITY -- quantity 
    public Keyboard(int keyboardId, KeyboardType keyboardType, double price, Quality quality, int qty ) {
        this.keyboardId = keyboardId; 
        this.keyboardType = keyboardType; 
        this.price = price; 
        this.quality = quality;
        this.qty = qty;  
    }

    public Keyboard(int keyboardId, KeyboardType keyboardType, double price, Quality quality) {
        this.keyboardId = keyboardId; 
        this.keyboardType = keyboardType; 
        this.price = price; 
        this.quality = quality;
    }


    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setQty(int qty) {
        this.qty = qty; 
    }

    protected int getID() {
        return this.keyboardId; 
    }

    protected  KeyboardType getKeyboardType() {
        return this.keyboardType; 
    }

    protected double getPrice() {
        return this.price;
    }

    protected Quality geQuality() {
        return this.quality; 
    }

    protected int getQty() {
        return this.qty; 
    }

    


}
