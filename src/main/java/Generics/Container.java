/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class Container <T> {
    
    private T t;
    
    public Container(){
        
    }
    
    public void add(T t){
        this.t = t ; 
    }
    
    public T retrieve(){
        return t ;
    }
    
     public static void main(String[] args) {
        Container<Integer> c1 = new Container<>();
        Container<String> c2 = new Container<>();
        
        c1.add(50);
        c2.add("Java");
        
        System.out.println("display integer type : " + c1.retrieve());
        System.out.println("display String type : " + c2.retrieve());
    }
}
