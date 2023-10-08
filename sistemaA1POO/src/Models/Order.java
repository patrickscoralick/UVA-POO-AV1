/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class Order implements Serializable{
    public int id;
    public ArrayList<Product> products;
    public boolean isPromotion;
    public float total;
    public Order(ArrayList<Product> products, boolean isPromotion, float total) {

        this.products = products;
        this.isPromotion = isPromotion;
        this.total = total;
    }

    public Order(int id, ArrayList<Product> products, boolean isPromotion, float total) {
        this.id = id;
        this.products = products;
        this.isPromotion = isPromotion;
        this.total = total;
    }
}
