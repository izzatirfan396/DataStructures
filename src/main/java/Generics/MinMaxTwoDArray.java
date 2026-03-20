/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class MinMaxTwoDArray {
    public static <E extends Comparable<E>> E min(E[][]list){
       /* E min = list[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(list[i][j].compareTo(min)<0){
                    min = list[i][j];
                }
            }
            
        }
        return min ;*/
       E min = list[0][0];
       for(E [] row : list){
           for(E item : row){
               if(item.compareTo(min)<0){
                   min = item;
               }
           }
       }
       return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][]list){
        /*E max = list[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(list[i][j].compareTo(max)>0){
                    max = list[i][j];
                }
            }
            
        }
        return max ;*/
        E max = list[0][0];
       for(E [] row : list){
           for(E item : row){
               if(item.compareTo(max)>0){
                   max = item;
               }
           }
       }
       return max;
    }
    
    }
