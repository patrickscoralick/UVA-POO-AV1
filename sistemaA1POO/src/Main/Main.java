package Main;

import Controllers.LoginController;
import Controllers.ProductController;
import Enums.Type;
import Models.Product;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        LoginController loginController =  new LoginController();
        
        System.out.println(loginController.login("Admin", "1234567"));
        
        ProductController productController = new ProductController();
        Product product = productController.add(new Product("Produto 1", "Produto 1", Type.DRINK, 233));
        System.out.println("Produto cirado com sucesso!");
        
        System.out.println(productController.get().get(0).id);
        
        /*try {
            productController.delete(product);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Produto deletado!");*/
        
        
        
        
    }

}
