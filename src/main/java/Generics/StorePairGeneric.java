/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class StorePairGeneric <T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>  {
    private T first, second;
    
    public StorePairGeneric(T first , T second){
        this.first = first ;
        this.second = second ; 
    }
    
    public T getFirst(){
        return first ;
    }
    
    public T getSecond(){
        return second ;
    }
    
    public void setPair(T first , T second){
        this.first = first ;
        this.second = second ; 
    }
    
    public String toString(){
        return "first = " + first + " second = " + second ; 
    }
    
    public int compareTo(StorePairGeneric<T> other){
        return this.first.compareTo(other.first);
    }
    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || !(obj instanceof StorePairGeneric)){
            return false ; 
        }
        StorePairGeneric<?> other = (StorePairGeneric<?>) obj;
        
        if(this.first == null){
            return other.first == null ;
        }
        
        return this.first.equals(other.first);
    }
    
    
}
