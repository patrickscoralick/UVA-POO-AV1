/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.Product;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class ProductDao extends Dao<Product> {
    
    private final String path = "C:\\DataTemp\\product";

    public ProductDao() {
        super.path = this.path;
    }
    
    @Override
    public Product set(Product product) {
        ArrayList<Product> products = this.get();
        product.id = products.size() + 1;
        return super.set(product); 
    }
    
    
}
