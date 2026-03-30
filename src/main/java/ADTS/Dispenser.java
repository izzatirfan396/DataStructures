/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

/**
 *
 * @author Izzat
 */
public class Dispenser {
    
    private String name ;
    private double price ;
    private int count ;
    
    public Dispenser(String name , double price , int count){
        this.name = name ;
        this.price = price ; 
        this.count = count ;
    }
    
    public String getName(){
        return name ;
    }
    
    public double getPrice(){
        return price ;
    }
    
    public int getCount(){
        return count;
    }
    
    public void dispense(){
        count -- ;
        System.out.println(name + " dispensed ! Enjoy :>");
    }
    
    public boolean isEmpty(){
        return count == 0 ;
    }
    
    
}
