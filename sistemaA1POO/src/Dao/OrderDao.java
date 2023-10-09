/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.Order;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class OrderDao extends Dao<Order> {
    
    private final String path = "C:\\DataTemp\\order";

    public OrderDao() {
        super.path = this.path;
    }
    
    @Override
    public Order set(Order order) {
        ArrayList<Order> orders = this.get();
        order.id = orders.size() + 1;
        return super.set(order); 
    }
}
