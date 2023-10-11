/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.ProductDao;
import Exceptions.InvalidIdException;
import Exceptions.InvalidQuantityExeception;
import Exceptions.ModelNotCreatedExeception;
import Models.Product;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class ProductController {
    
    
    public Product add(Product product) {
        ProductDao productDao =  new ProductDao();
        return productDao.set(product);
    }
    
    public void delete(Product product) throws Exception {
        if(product.id == -1) {
            throw new InvalidIdException("invalid id");
        }
        
        ProductDao productDao =  new ProductDao();
        ArrayList<Product> products = productDao.get();
        
        int productIndex = products.indexOf(product);
        
        if(productIndex != -1) {
            products.remove(productIndex);
            productDao.update(products);
        } else {
            throw new ModelNotCreatedExeception("product is not created");
        }
    }
    
    public Product update(Product product) throws InvalidQuantityExeception, InvalidIdException, ModelNotCreatedExeception {
        if(product.id == -1) {
            throw new InvalidIdException("invalid id");
        }
        
        ProductDao productDao =  new ProductDao();
        ArrayList<Product> products = productDao.get();
        
        int productIndex = products.indexOf(product);
        
        if(productIndex != -1) {
            products.set(productIndex, product);
            productDao.update(products);
        } else {
            throw new ModelNotCreatedExeception("product is not created");
        }
        
        return product;
    }
    
    public ArrayList<Product> get() {
        ProductDao productDao =  new ProductDao();
        ArrayList<Product> products = productDao.get();
        return products;
    }
    
    public Product getByProduct(Product product) {
        ProductDao productDao =  new ProductDao();
        ArrayList<Product> products = productDao.get();
        
        int productIndex = products.indexOf(product);
        
        return productIndex > -1 ? products.get(productIndex) : null;
    }

    public Product getByProductName(String productName) {
        ProductDao productDao = new ProductDao();
        ArrayList<Product> products = productDao.get();

        for (Product product : products) {
            if (product.name.equals(productName)) {
                return product;
            }
        }

        return null;
    }

    public double ValorProduto(String nomeProduto, int quantidade) throws Exception {
        ProductDao productDao = new ProductDao();
        ArrayList<Product> products = productDao.get();

        for (Product product : products) {
            if (product.name.equalsIgnoreCase(nomeProduto)) {
                if (quantidade > 0) {
                    return product.price * quantidade;
                } else {
                    throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
                }
            }
        }

        throw new IllegalArgumentException("Produto não cadastrado: " + nomeProduto);
    }

}
