/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class tester_Q2 {
    public static void main(String[] args) {
        
        MyGeneric<String> strObj = new MyGeneric<>("Sarah");
        MyGeneric<Integer> intObj = new MyGeneric<>();
        
       
        intObj.set(67);
        
        System.out.println("String : "+ strObj.get());
        System.out.println("Integer : "+ intObj.get());
    }
}
