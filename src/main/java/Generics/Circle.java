/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class Circle implements Comparable<Circle> {
    private double radius;
    public Circle(double radius){
        this.radius = radius; 
    }
    public int compareTo(Circle check){
        return Double.compare(this.radius, check.radius);
    }
    public String toString(){
        return Double.toString(this.radius);
    }
}
