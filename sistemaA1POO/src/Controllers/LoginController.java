/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Enums.Level;
import Models.User;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class LoginController {
    
    private final ArrayList<User> users;
    private boolean isAuthorization;

    public LoginController() {
        this.users = new ArrayList<>();
        
        this.users.add(new User("Pedro", "123456", Level.DEFAULT));
        this.users.add(new User("Admin", "123456", Level.ADMIN));
    }
    
    public boolean login(String login, String password) {
       this.isAuthorization = false;
       this.users.forEach(user -> {
           if((user.login == null ? login == null : user.login.equals(login)) && (user.password == null ? password == null : user.password.equals(password))) {
              this.isAuthorization = true;
           }
       });
        
        return isAuthorization;
    }
    
}
