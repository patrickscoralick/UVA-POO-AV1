/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author msmeneze
 */
public class Stock implements Serializable {
    public int id;
    public Product product;
    public int quantity;
    
    public Stock(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Stock(int id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }
    
    @Override
    public boolean equals(Object obj) {
         if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) obj;
        if (id != other.id) {
            return false;
        }
        
        if (!product.equals(other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + product.hashCode();
        return result;
    }
    
    
    
}
