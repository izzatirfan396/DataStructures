/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class MyGeneric <T> {
    
    private T e;
    
    public MyGeneric(){
        
    }
    
    public MyGeneric(T e){
        this.e = e ;
    }
    
    public void set(T e){
        this.e = e ; 
    }
    
    public T get(){
        return e;
    }
}
