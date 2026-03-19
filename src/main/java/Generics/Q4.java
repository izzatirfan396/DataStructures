/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class Q4 {
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red","blue","orange","tan"};
        System.out.println(Q4.<Integer>minmax(intArray));
        System.out.println(Q4.<String>minmax(strArray));
    }
    
    public static <T extends Comparable<T>> String minmax(T[]arr){
        T max = arr[0];
        T min = arr[0];
        for(int i=1 ; i<arr.length ; i++ ){
            if(arr[i].compareTo(max)>0){
              max = arr[i];
            }
            else if(arr[i].compareTo(min)<0){
                min = arr[i];
            }
        }
        return "Min = "+ min + " Max = "+ max ;
    }
    
}
