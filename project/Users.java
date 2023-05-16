package project;

import java.util.ArrayList;

public class Users {
    private static ArrayList <User> users = new ArrayList<User>();

    // INITIAL 
    public static boolean searchUsername(String username) {


        if (users.size() <= 0) {
            return false;
        }
            for (int i = 0; i < users.size(); i++) {

                if (users.get(i).getUsername().equals(username)) {
                    return true;
                }
           
            }

        
        return false;
    }


    /**
     * @param username
     * @param password
     * @return
     */
    // method used to change user details/ 
    public static boolean validateUser(String username, String password) {

        if (users.size() <= 0) {
            return false; 
        }

        else {

            for (int i = 0; i < users.size(); i++) {

                if (users.get(i).getUsername().equals(username)  && users.get(i).getPassword().equals(password)) {
                    return true;
                }
            }
     
        }
        return false;

    }


    public static boolean validatePassword(String password) {

        if (password == null) { 
            return false;
        }

        else {
          
            int length = password.length(); 

            if (length > 5) {
                return true;
            }
            else {
                return false;
            }
      
        }
    }

    //method return user array list
    public static ArrayList<User> printUser() {
        

        if (users.size() <= 0) {
            return null;
        }

        ArrayList<User> userArray = users;


        return userArray;

    }

    //create method to add arrayList
    public static void createNewUser(String username, String name, String password, int age )  {

        User userTemp = new User(username, name, password, age); 
        Users.users.add(userTemp); 

    }



//setter to change arrasy list 
public static boolean setUserArray(ArrayList<User> newUserList) {

    if (newUserList == null) {
        return false;
    }

    else {
        users = newUserList; 
    }
    return false; 
}

//  search user via username 
public static User searchUser(String username) {

    if  (users.size() <= 0) {
        return null; 
    }

    for (int i = 0; i < users.size(); i++ ) {
        if (users.get(i).getUsername().equals(username)) {
            return users.get(i);
        }
    }

    return null;

}



}


