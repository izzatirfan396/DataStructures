/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Izzat
 */
public class CartNode {
    Product p ;
    CartNode next;
    int quantity ;
    
    public CartNode(Product p , CartNode next , int quantity){
        this.p = p ;
        this.next = next ;
        this.quantity = quantity ;
    }
    
    
}
