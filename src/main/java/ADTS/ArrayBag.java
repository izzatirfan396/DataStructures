/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

/**
 *
 * @author Izzat
 */
public class ArrayBag<T> implements BagInterface<T> {
    private T [] bag ;
    private int DEFAULT_CAPACITY ;
    private int numberOfEntries ; 
    
    public ArrayBag(){
        DEFAULT_CAPACITY = 25;
        bag = (T[]) new Object[DEFAULT_CAPACITY];
    }
    
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    public boolean isFull(){
        return numberOfEntries >= DEFAULT_CAPACITY ;
    }
    
    public boolean isEmpty(){
        return numberOfEntries == 0 ;
    }
    
    public boolean add (T newEntry ){
        if(!isFull()){
            bag[numberOfEntries]= newEntry ;
            numberOfEntries ++ ;
            return true;
        }
        return false; 
        
    }
    
    public T remove(){
       
        T r = bag[numberOfEntries - 1] ;
        bag[numberOfEntries - 1] = null ;
        numberOfEntries -- ;
        return r ;       
    }
    
    public boolean remove(T anEntry){
        for (int i = 0; i < numberOfEntries ; i++) {
            if(bag[i] .equals(anEntry)){
                bag[i] = bag[numberOfEntries -1] ;
                bag[numberOfEntries -1] = null ;
                numberOfEntries -- ;
                return true ;
            }
          
        }
        return false ;
    }
    
    public void clear(){
        for (int i = 0; i < numberOfEntries; i++) {
            bag[i] = null;
        }
        numberOfEntries = 0  ;
    }
    
    public int getFrequencyOf (T anEntry){
        int count = 0 ;
        for (int i = 0; i < numberOfEntries; i++) {
            if(bag[i] != null && bag[i].equals(anEntry)){
                count += 1;
            }
        }
        return count;
    }
    
     public boolean contains (T anEntry){
        
        for (int i = 0; i < numberOfEntries; i++) {
            if(bag[i] != null && bag[i].equals(anEntry)){
                return true;
            }
        }
        return false;
    }
     
    public T[] toArray(){
        T[] newBag = (T[]) new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            newBag[i]=bag[i];
        }
        return newBag   ;
    }
    
    public BagInterface<T> union(BagInterface<T> otherBag){
        
       ArrayBag<T> combinedBag = new ArrayBag<>();
       T [] thisBagArray = this.toArray();
       T [] otherBagArray = otherBag.toArray();
        for (int i = 0; i < thisBagArray.length ; i++) {
            combinedBag.add(thisBagArray[i]);
        }
        for (int i = 0; i < otherBagArray.length; i++) {
            combinedBag.add(otherBagArray[i]);
        }
        return combinedBag; 
       
    }
    
    public BagInterface<T> intersection(BagInterface<T> otherBag){
        
       ArrayBag<T> newIntsBag = new ArrayBag<>();
       T [] thisBagArray = this.toArray();
       
       ArrayBag<T> copyOfOther = new ArrayBag<>();
       T [] otherBagArray = otherBag.toArray();
        for (int i = 0; i < otherBagArray.length ; i++) {
            copyOfOther.add(otherBagArray[i]);
        }
        for (int i = 0; i < thisBagArray.length ; i++) {
            if(copyOfOther.contains(thisBagArray[i])){
                newIntsBag.add(thisBagArray[i]);
                copyOfOther.remove(thisBagArray[i]);
            }
        }
      
        return newIntsBag ;
    }
    
    public BagInterface<T> difference(BagInterface<T> otherBag){
        
        ArrayBag<T> newDiffBag = new ArrayBag<>();
        
        T [] thisBagArray = this.toArray();
        ArrayBag<T> copyOfOther = new ArrayBag<>();
        T[] otherBagArray = otherBag.toArray();        
        for (int i = 0; i < otherBagArray.length; i++) { //adding the content in the bag passed into Copy of the bag
            copyOfOther.add(otherBagArray[i]);
        }
        
        for (int i = 0; i < thisBagArray.length; i++) {
            if(copyOfOther.contains(thisBagArray[i])){
               copyOfOther.remove(thisBagArray[i]); 
            }else{
                newDiffBag.add(thisBagArray[i]);
            }
        }
        return newDiffBag ;
    }
    
    
    
}
