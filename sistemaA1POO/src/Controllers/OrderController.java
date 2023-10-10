/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.OrderDao;
import Exceptions.ColumnNotFoundException;
import Exceptions.InvalidIdException;
import Exceptions.ModelNotCreatedExeception;
import Models.Order;
import Models.Product;
import Models.Stock;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class OrderController {
    
    public Order add(Order order) throws Exception {
        OrderDao orderDao = new OrderDao();
        ProductController productController = new ProductController();
        StockController stockController = new StockController();
        Product product;
        Stock stock;
        for(Product p : order.products) {
            product = productController.getByProduct(p);
            stock = stockController.getByProduct(p);
            
            if(product == null) {
                throw new ModelNotCreatedExeception("Product is not exist");
            }
            
            if(stock == null) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }
            
            if(stock.quantity <= 0) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }
            
            stock.quantity--;
            stockController.update(stock);
            
        }
        
        return orderDao.set(order);
    }
    
    public void delete(Order order) throws Exception {
        OrderDao orderDao = new OrderDao();
        StockController stockController = new StockController();
        Stock stock;
        for(Product p : order.products) {
            stock = stockController.getByProduct(p);
            stock.quantity++;
            stockController.update(stock);
        }
        
         ArrayList<Order> orders = orderDao.get();
         
         int orderIndex = orders.indexOf(order);
         
          if(orderIndex != -1) {
            orders.remove(orderIndex);
            orderDao.update(orders);
        } else {
            throw new ModelNotCreatedExeception("order is not created");
        }
        
        
    }
    
    
    public Order update(Order order) throws Exception {
        OrderDao orderDao = new OrderDao();
        ProductController productController = new ProductController();
        StockController stockController = new StockController();
        Product product;
        Stock stock;
        
        if(order.id == -1) {
            throw new InvalidIdException("invalid id");
        }
        
        for(Product p : order.products) {
            product = productController.getByProduct(p);
            stock = stockController.getByProduct(p);
            
            if(product == null) {
                throw new ModelNotCreatedExeception("Product is not exist");
            }
            
            if(stock == null) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }
            
            if(stock.quantity <= 0) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }
            
            stockController.update(stock);
        }
        
        ArrayList<Order> orders = orderDao.get();
         
         int orderIndex = orders.indexOf(order);
         
          if(orderIndex != -1) {
            orders.set(orderIndex, order);
            orderDao.update(orders);
        } else {
            throw new ModelNotCreatedExeception("order is not created");
        }
       
        return order;
    }
    
     public ArrayList<Order> get() {
        OrderDao orderDao = new OrderDao();
        return orderDao.get();
    }
    
    
    
}
