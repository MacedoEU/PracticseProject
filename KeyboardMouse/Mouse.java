package KeyboardMouse;

public class Mouse {
    

    private int mouseId; 
    private MouseType mouseType; 
    private double price; 
    private Quality quality; 
    private int qty; 

    public Mouse(int mouseId, MouseType mouseType, double price, Quality qualty) {
        this.mouseId = mouseId; 
        this.mouseType = mouseType; 
        this.price = price; 
        this.quality = qualty; 
    }

    public Mouse(int mouseId, MouseType mouseType, double price, Quality qualty, int qty) {
        this.mouseId = mouseId; 
        this.mouseType = mouseType; 
        this.price = price; 
        this.quality = qualty;
        this.qty = qty;  
    }


    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setQty(int qty) {
        this.qty = qty; 
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

    protected Quality getQuality() {
        return this.quality; 
    }

    protected int getQty() {
        return this.qty; 
    } 

    


}
