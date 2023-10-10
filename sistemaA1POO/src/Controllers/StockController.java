/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.ProductDao;
import Dao.StockDao;
import Exceptions.InvalidIdException;
import Exceptions.InvalidQuantityExeception;
import Exceptions.ModelNotCreatedExeception;
import Models.Product;
import Models.Stock;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class StockController {
    
    public Stock add(Stock stock) throws Exception {
        ProductDao productDao = new ProductDao();
        
       ArrayList<Product> products = productDao.get();
       
       
       if(!products.contains(stock.product)) {
           throw new ModelNotCreatedExeception("Product is not exist");
       }
       
       if(stock.quantity < 1) {
           throw new InvalidQuantityExeception("The quantity must be greater than 0");
       }
       
        StockDao stockDao = new StockDao();
        stock = stockDao.set(stock);
        
        return stock;
    }
    
    public void delete(Stock stock) throws Exception {
        if(stock.id == -1) {
            throw new InvalidIdException("invalid id");
        }
        
        StockDao stockDao = new StockDao();
         ArrayList<Stock> stocks = stockDao.get();
         
         int stockIndex = stocks.indexOf(stock);
         
          if(stockIndex != -1) {
            stocks.remove(stockIndex);
            stockDao.update(stocks);
        } else {
            throw new Exception("stock is not created");
        }
    }
    
    
    public Stock update(Stock stock) throws InvalidQuantityExeception, InvalidIdException, ModelNotCreatedExeception {
         if(stock.id == -1) {
            throw new InvalidIdException("invalid id");
        }
         
         if(stock.quantity < 0) {
             throw new InvalidQuantityExeception("invalid quantity");
         }
         
         StockDao stockDao = new StockDao();
         ArrayList<Stock> stocks = stockDao.get();
         
         int stockIndex = stocks.indexOf(stock);
         
          if(stockIndex != -1) {
            stocks.set(stockIndex, stock);
            stockDao.update(stocks);
        } else {
            throw new ModelNotCreatedExeception("stock is not created");
        }
        
        return stock;  
    }
    
    public ArrayList<Stock> get() {
        StockDao stockDao = new StockDao();
        return stockDao.get();
    }
    
    public Stock getByStock(Stock stock) {
        StockDao stockDao = new StockDao();
        ArrayList<Stock> stocks = stockDao.get();
        
        int stockPosition = stocks.indexOf(stock);
       
        return stockPosition > -1 ? stocks.get(stockPosition) : null;
    }
    
    public Stock getByProduct(Product product) {
        StockDao stockDao = new StockDao();
        ArrayList<Stock> stocks = stockDao.get();
        Stock findStock = null;
        
        for(int i=0; i<stocks.size(); i++){
            if(stocks.get(i).product.equals(product)) {
                findStock = stocks.get(i);
                break;
            }
        }
        return findStock;
    }
}
