package KeyboardMouse;

public class Mouse {
    

    private int mouseId; 
    private MouseType mouseType; 
    private double price; 
    private Quality quality; 

    public Mouse(int mouseId, MouseType mouseType, double price, Quality qualty) {
        this.mouseId = mouseId; 
        this.mouseType = mouseType; 
        this.price = price; 
        this.quality = qualty; 
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getID() {
        return this.mouseId; 
    }

    protected  MouseType getMouseType() {
        return this.mouseType; 
    }

    protected double getPrice() {
        return this.price;
    }

    protected Quality geQuality() {
        return this.quality; 
    }

    


}
