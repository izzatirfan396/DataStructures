/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Izzat
 */
public class Product {
    
    private int id ;
    private String name;
    private double price ;
    private int stock ;
    
    public Product(int id , String name , double price , int stock){
        this.id = id;
        this.name = name;
        this.price = price ; 
        this.stock = stock ;
    } 
    
    public void setId(int id){
        this.id = id ;
    }
    
    public int getId(){
        return this.id ;
    }
    
    public void setName(String name){
        this.name = name ;
    }
    
    public String getName(){
        return this.name ;
    }
    
    public void setPrice(double price){
        this.price = price ;
    }
    
    public double getPrice(){
        return this.price ;
    }
    
    public void setStock(int stock){
        this.stock = stock ;
    }
    
    public int getStock(){
        return this.stock ;
    }
    
    public String toString(){
        return getId() + "," + getName()+ "," + getPrice() + "," + getStock()  ;
    }
    
}
