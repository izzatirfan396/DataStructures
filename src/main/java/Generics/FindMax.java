/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class FindMax {
    public static <E extends Comparable<E>> E max(E[]list){
        if(list == null){
            return null ; 
        }
        E max = list[0];
        for(E item : list){
            if(item.compareTo(max)>0){
                max = item ; 
            }
    }
        return max;
    
}
}
