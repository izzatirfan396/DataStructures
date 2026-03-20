/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class testerQ6 {
    public static void main(String[] args) {
         Integer[][] array = {{4, 5, 6}, {1, 2, 3}};
         System.out.println(MinMaxTwoDArray.<Integer>min(array));
         System.out.println(MinMaxTwoDArray.<Integer>max(array));
    }
}
