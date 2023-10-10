package Main;

import Controllers.LoginController;
import Controllers.OrderController;
import Controllers.ProductController;
import Controllers.StockController;
import Enums.Type;
import Models.Order;
import Models.Product;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        LoginController loginController =  new LoginController();
        
        System.out.println(loginController.login("Admin", "1234567"));
        
        ProductController productController = new ProductController();
   
        Product product1 = productController.add(new Product("Produto 1", "Produto 1", Type.DRINK, 233));
        Product product2 = productController.add(new Product("Produto 2", "Produto 2", Type.SALT, 23));
        Product product3 = productController.add(new Product("Produto 3", "Produto 3", Type.SALT, 10));
        System.out.println("Produto criado com sucesso!");
        
        
        
       /*StockController stockController = new StockController();
         try {
            stockController.add(new Stock(product1, 10));
            stockController.add(new Stock(product2, 10));
            stockController.add(new Stock(product3, 10));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList<Product> productsAll = productController.get();
        OrderController orderController = new OrderController();
        ArrayList<Product> products = new ArrayList<>();
        
        Product product1 = productsAll.get(0);
        Product product2 = productsAll.get(1);
        
        products.add(product1);
        products.add(product2);
        
        try {
            orderController.add(new Order(products, false, product1.price + product2.price));
            
            System.out.println("Quantidade em estoque: "+ stockController.getByProduct(product1).quantity);
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
             
        
    }

}
