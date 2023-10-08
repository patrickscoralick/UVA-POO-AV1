/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.Order;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class OrderDao {
    
    private final String path = "C:\\DataTemp\\order";
    public Order set(Order order){
        try {
            ArrayList<Order> orders = this.get();
            order.id = orders.size() + 1;
            orders.add(order);
       
            
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(orders);
            objectOut.close();
            return order;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Order> update(ArrayList<Order> orders){
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(orders);
            objectOut.close();
            return orders;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Order> get() {
        FileInputStream fi;
         ArrayList<Order> orders = new ArrayList<>();
        try {
            fi = new FileInputStream(path);
            try (ObjectInputStream oi = new ObjectInputStream(fi)) {
               ArrayList<Order> ordersRead = (ArrayList<Order>) oi.readObject();
               if(ordersRead != null) {
                   orders = ordersRead;
               }
               
            }
            fi.close();    
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return orders;
    }
}
