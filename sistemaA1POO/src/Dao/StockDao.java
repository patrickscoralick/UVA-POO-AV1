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
public class StockDao {
    
    private final String path = "C:\\DataTemp\\stock";
    public Stock set(Stock stock){
        try {
            ArrayList<Stock> stocks = this.get();
            stock.id = stocks.size() + 1;
            stocks.add(stock);
       
            
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(stocks);
            objectOut.close();
            return stock;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Stock> update(ArrayList<Stock> stocks){
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(stocks);
            objectOut.close();
            return stocks;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Stock> get() {
        FileInputStream fi;
         ArrayList<Stock> stocks = new ArrayList<>();
        try {
            fi = new FileInputStream("C:\\DataTemp\\data");
            try (ObjectInputStream oi = new ObjectInputStream(fi)) {
               ArrayList<Stock> stoksRead = (ArrayList<Stock>) oi.readObject();
               if(stoksRead != null) {
                   stocks = stoksRead;
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
        return stocks;
    }
}
