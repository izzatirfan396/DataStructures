/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

/**
 *
 * @author Izzat
 */
public class ArrayBagDemo {
    
   private static void testAdd(BagInterface<String> aBag, String[] content){
       for (int i = 0; i < content.length; i++) {
           aBag.add(content[i]);
       }
   }
   
   private static void displayBag(BagInterface<String> aBag){
       System.out.println("The number of entries contains in bag : " + aBag.getCurrentSize());
       Object [] array =  aBag.toArray();
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i]+ " ");
       }
       System.out.println();
   }
   
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        testAdd(bag1 , contentsOfBag1);
        testAdd(bag2 , contentsOfBag2);
        
        displayBag(bag1);
        displayBag(bag2);
        
        BagInterface<String> bag3 = bag1.union(bag2); //BagInterface because the method call return in BagInterface , so the ArrayBag is small hierarchy comapre d to the BagInterface , thus cant type ArrayBag for bag3
        displayBag(bag3);
        
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);
        
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
    }
}
