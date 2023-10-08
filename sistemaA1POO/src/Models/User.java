/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Enums.Level;

/**
 *
 * @author msmeneze
 */
public class User {
    public String login;
    public String password;
    public Level level;
    
    public User(String login, String password, Level level) {
        this.login = login;
        this.password = password;
        this.level = level;
    }
}
