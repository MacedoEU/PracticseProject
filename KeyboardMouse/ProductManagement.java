package KeyboardMouse;

import java.util.ArrayList;

public class ProductManagement {
    
    private static ArrayList <Keyboard> keyboard = new ArrayList<Keyboard>();
    private static ArrayList <Mouse> mouse = new ArrayList<Mouse>();

    public static boolean addKeyboard(int id, KeyboardType keyboardType, double price, Quality quality)  {

        try {
            Keyboard keyboardTemp = new Keyboard(id, keyboardType, price, quality); 
            keyboard.add(keyboardTemp);
            return true;
        } catch(Exception e) {
            return false; 
        }

    }

    public static boolean addMouse(int id, MouseType mouseType, double price, Quality quality) {

        try {
        Mouse mouseTemp = new Mouse(id, mouseType, price, quality); 
        mouse.add(mouseTemp);
        return true;
        }  catch (Exception e) {
            return false;
        }
    }

    public static ArrayList<Keyboard> getKeyboardArray() {
        try {
             if (keyboard == null) {
                return null;
             }

             else {
                return keyboard; 
             }

        } catch(Exception e) {
            return null;
        }
    }

    public static ArrayList<Mouse> getMouseArray() {

        try {
            if (mouse == null) {
                return null; 
            }

            else {
                return mouse;
            }
        } catch (Exception e ) {
            return null; 
        }
    }


    public static Keyboard searchKeyboard(int id) {

        try {
            if (keyboard == null) {
                return null;
            }

            else {
                for (int i = 0; i < keyboard.size(); i++) {

                    if (keyboard.get(i).getID() == id) {
                        return keyboard.get(i);
                    }
                }
            }


        } catch (Exception e) {
            return null; 
        }
        return null;
    }

    public static Mouse searchMouse(int id) {

        try {

            if (mouse == null) {
                return null; 
            }

            else {

                for (int i = 0; i < mouse.size(); i++) {
                    
                    if (mouse.get(i).getID() == id) {
                        return null;
                    }

                }

                return null;
            } 

        } catch (Exception e) {
            return null;
        }
    }



}
