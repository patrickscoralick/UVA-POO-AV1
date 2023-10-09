/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.Stock;
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
public class StockDao extends Dao<Stock> {
    
    private final String path = "C:\\DataTemp\\stock";

    public StockDao() {
        super.path = this.path;
    }
    
    @Override
    public Stock set(Stock stock) {
        ArrayList<Stock> stocks = this.get();
        stock.id = stocks.size() + 1;
        return super.set(stock); 
    }
   
}
