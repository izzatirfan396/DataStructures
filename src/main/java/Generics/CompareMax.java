/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class CompareMax {
    public static <T extends Comparable<T>> T Maximum(T a , T b , T c){
        T max = a ;
        if(b.compareTo(max)>0){
            max = b ;
        }
        if(c.compareTo(max)>0){
            max = c; 
        }
        return max ;
    }
}
