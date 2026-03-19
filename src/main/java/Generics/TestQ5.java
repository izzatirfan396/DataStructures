/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class TestQ5 {
    public static void main(String[] args) {
        Integer [] arrInt = {1,2,3};
        String [] arrStr = {"red" , "green","blue"};
        Circle [] arrCir = {new Circle(3),new Circle(2.9), new Circle(5.9)};
        
        System.out.println(FindMax.max(arrInt));   
        System.out.println(FindMax.max(arrStr));
        System.out.println(FindMax.max(arrCir));   
    }
}
