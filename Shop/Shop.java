package Shop;

import java.util.ArrayList;

import KeyboardMouse.Keyboard;
import KeyboardMouse.Mouse;
import User.User;
import Staff.Staff; 

public class Shop {
    
    private String shopName; 
    private ShopLocationEnum shopLocation; 

    private ArrayList <User> users = new ArrayList<User>();
    private ArrayList <Keyboard> keyboards = new ArrayList<Keyboard>();
    private ArrayList <Mouse> mouses = new ArrayList<Mouse>(); 
    private ArrayList <Staff> staff = new ArrayList<Staff>();  

    public Shop(String shopName, ShopLocationEnum shopLocationEnum, ArrayList<User> users, ArrayList<Keyboard> keyboards, ArrayList<Mouse> mouses, ArrayList<Staff> staff) {
        this.shopName = shopName; 
        this.shopLocation = shopLocationEnum; 
        this.users = users; 
        this.keyboards = keyboards; 
        this.mouses = mouses; 
        this.staff = staff; 
    }

    protected String getShopName() {
        return this.shopName;
    }

    protected ShopLocationEnum getShopLocation() {
        return this.shopLocation; 
    }

    protected ArrayList<User> getUsers() {
        return this.users; 
    }
    
    protected ArrayList<Keyboard> getKeyboards() {
        return this.keyboards; 
    }

    protected  ArrayList<Mouse> getMouses() {
        return this.mouses; 
    }

    protected ArrayList<Staff> geStaff() {
        return this.staff; 
    }

    protected  void setShopName(String shopName) {
            this.shopName  = shopName; 
    }

    protected void setShopLocation(ShopLocationEnum shopLocationEnum) {
        this.shopLocation = shopLocationEnum; 
    }

    protected void setUsers(ArrayList<User> users) {
        this.users = users; 
    }
    
    protected void setKeyboards(ArrayList<Keyboard> keyboards) {
        this.keyboards = keyboards; 
    }


    protected void setMouse(ArrayList<Mouse> mouse) {
        this.mouses = mouse; 
    }

    protected void setStaff(ArrayList<Staff> staff) {
        this.staff = staff; 
    
    }
    


}
