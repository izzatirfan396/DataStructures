/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Izzat
 */
public class CartList {
    CartNode head = null ;
    CartNode tail = null ;
    int size = 0 ;

    public void addItem(Product p , int qty){
        
      if(tail==null){
          CartNode item = new CartNode(p , null , qty);
          head = tail = item;
      }else{
          CartNode temp = head ;
          for (int i = 0; i < size ; i++) {
              if(temp.p.equals(p)){
                  temp.quantity += qty ;
                  return ; 
              }
              temp = temp.next ; 
          }
          
          CartNode item = new CartNode(p , null , qty);
          tail.next = item ; 
          tail = item ;
      }
      size ++ ; 
    }
    
    public void removeitem( int productId ){
        
        if(tail == null){
            System.out.println("Cart is empty !");
            return ;
        }else{
            CartNode current = head ;
            if(current.p.getId()== productId){
                head = head.next ;
                size-- ;
                return ; 
            }else{
                for (int i = 1; i < size ; i++) {
                    if(current.next.p.getId()== productId && current.next.equals(tail)){
                        tail = current ; 
                        current.next = current.next.next ;
                        size--;
                        return;
                    }else if(current.next.p.getId()== productId){
                        current.next = current.next.next ;
                        size--;
                        return;
                    }
                    current = current.next ;
                }
                System.out.println("Product not found in cart.");
                return;
            }
        
    }
}
    
    public void updateQuantity(int productId, int newQty){
        CartNode current  = head ;
        for (int i = 0; i < size; i++) {
            if(current.p.getId()== productId){
                current.quantity = newQty ; 
                return ;
            }else{
                current = current.next ;
            }         
        }
        System.out.println("Product not found in cart.");
        return;
    }
    
    public CartNode findItem(int productId){
        CartNode current = head ;
        for (int i = 0; i < size; i++) {
            if(current.p.getId()== productId){
                return current ;
            }
            current = current.next ;
        }
        return null;
    }
    
    public void displayCart(){
        if(head == null){
            System.out.println("The cart is empty.");
            return ;
        }else{
        System.out.printf("%-5s %-15s %-10s %-10s%n", "Name", "Quantity", "Price", "Subtotal" );    
        CartNode current = head ; 
        for (int i = 0; i < size; i++) {
            double total = current.quantity * current.p.getPrice() ;
            System.out.printf("%-5s %-15d %-10.2f %-10.2f%n", current.p.getName(), current.quantity, current.p.getPrice(), total);
            current = current.next ;
        }
    }
  }
    
    public double calculateTotal(){
        double total = 0 ; 
        if(head == null){
            System.out.println("The cart is empty.");
            return 0;
        }else{
            CartNode current = head ;
            for (int i = 0; i < size; i++) {
              total = total + (current.quantity * current.p.getPrice()) ;
              current = current.next;
            }
        }
        return total ;
    }
    
    public void clear(){
        head = tail = null ;
        size =0;
        System.out.println("Cart is clear.");
    }
    
    public void undo(){
        if(isEmpty()){
            System.out.println("The cart is empty.");
            return ;
        }else if(head==tail){
            head=tail=null;
            size--;
            return;
        }else{     
        CartNode current = head ;
        for (int i = 0; i < size; i++) {
            if(current.next == tail){
                tail = current ; 
                tail.next = null; 
                size--;
                System.out.println("Cart is updated !");
                return ; 
            }
            current = current.next ; 
        }
    }
    }
    public int getSize(){
        return size ;
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true ;
        }else{
            return false ;
        }
    }
    
}

