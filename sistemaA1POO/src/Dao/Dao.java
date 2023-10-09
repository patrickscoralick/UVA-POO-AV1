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
 * @param <T>
 */
public class Dao<T> {
    
    protected String path = null;
    
     public T set(T object){
        try {
            ArrayList<T> objects = this.get();
            objects.add(object);
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(objects);
            objectOut.close();
            return object;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<T> update(ArrayList<T> objects){
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(objects);
            objectOut.close();
            return objects;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<T> get() {
        FileInputStream fi;
         ArrayList<T> objects = new ArrayList<>();
        try {
            fi = new FileInputStream(path);
            try (ObjectInputStream oi = new ObjectInputStream(fi)) {
               ArrayList<T> objectsRead = (ArrayList<T>) oi.readObject();
               if(objectsRead != null) {
                   objects = objectsRead;
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
        return objects;
    }
}
