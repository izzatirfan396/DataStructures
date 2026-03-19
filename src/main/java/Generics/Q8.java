/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

import java.util.ArrayList;

/**
 *
 * @author Izzat
 */
public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
			numOfCars.add((int)(Math.random() * 6));
			milesPerHour.add(Math.random() * 100 + 20);
		}
        display(numOfCars);
        System.out.println();
        display(milesPerHour);
    }
    
    public static  void display(ArrayList<?> listCount){
        for (Object element : listCount){
            System.out.println(element + " ");
        }
    }
}
