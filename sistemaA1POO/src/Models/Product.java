/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Enums.Type;
import java.io.Serializable;

/**
 *
 * @author msmeneze
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    public int id = -1;
    public String name;
    public String description;
    public Type type;
    public float price;
    
    public Product(int id, String name, String description, Type type, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
    }

    public Product(String name, String description, Type type, float price) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
         if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    
    @Override
    public String toString() {
        return name;
   }
    
    

    
}
