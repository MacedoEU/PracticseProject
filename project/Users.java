package project;

import java.util.ArrayList;

public class Users {
    public static ArrayList <User> users = new ArrayList();

    public static int searchUsername(String username) {

        if (users == null) {
            return 0; 
        }

        else {

            for (int i = 0; i <= users.size(); i++ ) {

                if (users.get(i).getUsername() == username) {
                    return 1;
                }
                else {
                    return 0;
                }
            }

        }
        return 0;
    }


    public static int validateUser(String username, String password) {

        if (users == null) {
            return 0; 
        }

        else {

            for (int i = 0; i <= users.size(); i++) {

                if (users.get(i).getUsername() == username && users.get(i).getPassword() == password) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
            return 0;
        }

        

    }




}
