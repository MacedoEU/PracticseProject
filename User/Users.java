package User;

import java.util.ArrayList;

public class Users {
    private static ArrayList <User> users = new ArrayList<User>();

    // INITIAL 
    protected static boolean searchUsername(String username) {

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
    protected static boolean validateUser(String username, String password) {
        try {
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

        } catch (Exception e) {
            return false; 
        } 

        return false;

    }


    protected static boolean validatePassword(String password) {

        try {
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

    } catch (Exception e) {
        return false; 
    } 


    }

    //method return user array list
    protected static ArrayList<User> printUser() {
        
        try {
        if (users.size() <= 0) {
            return null;
        }

        ArrayList<User> userArray = users;
        return userArray;


    } catch (Exception e) {
        return null;
    }

     

    }

    //create method to add arrayList
    protected static boolean createNewUser(String username, String name, String password, int age, double money )  {
        try {
        User userTemp = new User(username, name, password, age,  money); 
        Users.users.add(userTemp);
        return true; 
        }    catch (Exception e) {
            return false;
        }

    }



//setter to change arrasy list 
protected static boolean setUserArray(ArrayList<User> newUserList) {
try { 
    if (newUserList == null) {
        return false;
    }

    else {
        users = newUserList; 
    }
    return false;
    
} catch (Exception e) {
    return false; 
}
}

//  search user via username 
protected static User searchUser(String username) {

    try {

    if  (users.size() <= 0) {
        return null; 
    }

    for (int i = 0; i < users.size(); i++ ) {
        if (users.get(i).getUsername().equals(username)) {
            return users.get(i);
        }
    }

    return null;
} catch (Exception e) {
    return null;
}
}




}


