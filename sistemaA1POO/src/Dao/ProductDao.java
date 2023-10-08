/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.Product;
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
public class ProductDao {
    
    private final String path = "C:\\DataTemp\\product";
    public Product set(Product product){
        try {
            ArrayList<Product> products = this.get();
            product.id = products.size() + 1;
            products.add(product);
       
            
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(products);
            objectOut.close();
            return product;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Product> update(ArrayList<Product> products){
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(products);
            objectOut.close();
            return products;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Product> get() {
        FileInputStream fi;
         ArrayList<Product> products = new ArrayList<>();
        try {
            fi = new FileInputStream("C:\\DataTemp\\data");
            try (ObjectInputStream oi = new ObjectInputStream(fi)) {
               ArrayList<Product> productsRead = (ArrayList<Product>) oi.readObject();
               if(productsRead != null) {
                   products = productsRead;
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
        return products;
    }
}
