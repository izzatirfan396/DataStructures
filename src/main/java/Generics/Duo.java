/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Izzat
 */
public class Duo <A , B> {
    private A first ; //Declare a variable named first of type A
    private B second ; //second variable named second of type B.
    
    public Duo(A first , B second){ //Create a constructor that accepts these two parameters.
        this.first = first ; // assign these parameters respectively to the declared variables. 
        this.second = second ;
    }
    
    public static void main(String[] args) {

        //declare and create two objects as follows :

        Duo<String , Integer> sideShape = new Duo<>("Triangle" , 3); //First object called sideShape consist of respectively String type and Integer type.
        Duo<Double , Double> points = new Duo<>(6.7 , 7.6); //Second object called points consists of two Double types. 
        
    }
}
