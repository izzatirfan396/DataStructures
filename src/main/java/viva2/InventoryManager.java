/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Izzat
 */
public class InventoryManager {
    private ArrayList<Product> list;
    
    
    public InventoryManager(){
        list = new ArrayList<Product>();
        
    }
    
    public void loadFromFile(String filename){
        try{
            Scanner read = new Scanner(new FileInputStream(filename));
            while(read.hasNextLine()){
                String line = read.nextLine();
                String [] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                int stock = Integer.parseInt(parts[3]);
                list.add(new Product(id, name , price , stock));
            }
            read.close();
        }catch(IOException ex){
            System.out.println("Error file : "+ ex);
        }
    }
    
    public void saveToFile(String filename){
        try{
            PrintWriter write = new PrintWriter(new FileOutputStream(filename));
            for (int i = 0; i < list.size(); i++) {
                write.println(list.get(i));
            }
            write.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e);
        }
    }
    
    public void addProduct(Product p){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==(p.getId())){
                System.out.println("Error ! (No duplicate ID allowed)");
                return;
            }
        }
        list.add(p);
        
    }
    
    public void removeProduct(int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()== id){
                list.remove(i);
                System.out.println("The product with ID "+id + " sucessfully removed.");
                return;
            }
        }
        System.out.println("Invalid ID entered.");
    }
    
    public Product searchById(int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                return list.get(i);
            }
        }
        return null ;
    }
    
    public ArrayList<Product> searchByName(String name){
        ArrayList<Product> searchResult = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                searchResult.add(list.get(i));
            }
        }
        if(searchResult.isEmpty()){
            System.out.println("There is no product name : "+name +" in the Inventory");
            return null;
        }
        return searchResult ;
    }
    
    public void updateStock(int id , int newStock){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()== id){ 
                list.get(i).setStock(newStock);
            }
        }
    }
    
    public void displayAll(){
        System.out.printf("%-5s %-15s %-10s %-10s%n", "ID", "Name", "Price", "Stock" );
        for (int i = 0; i < list.size(); i++) {
            int id = list.get(i).getId();
            String name = list.get(i).getName();
            double price = list.get(i).getPrice();
            int stock = list.get(i).getStock();
        System.out.printf("%-5d %-15s %-10.2f %-10d%n", id, name, price, stock);
        }
        
    }
    
    public Product getProductById(int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                return list.get(i);
            }
        }
        System.out.println("Invalid ID entered");
        return null;
    }
    
    public boolean isAvailable(int id, int requestedQty){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()== id){
                if(list.get(i).getStock()>= requestedQty){
                    return true ;
                }else{
                    return false ; 
                }
            }
        }
        return false;
    }
}
