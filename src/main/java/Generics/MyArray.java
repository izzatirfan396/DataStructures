/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class MyArray {
    
    public static <T> void listAll(T [] array){ //need to be static because main is static , static method cant call non static method directly
        for (T element : array ){
            System.out.print(element + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5} ; //Must be Integer not int , because generics only works for reference/non primitive type only . int is primitive 
        String [] names = {"Jane","Tom","Bob"};
        Character [] alphabet = {'a','b','c'}; //Must be Character not char , because generics only works for reference/non primitive type only .  char is primitive 
        
        listAll(numbers);
        listAll(names);
        listAll(alphabet);
    }
    
}
