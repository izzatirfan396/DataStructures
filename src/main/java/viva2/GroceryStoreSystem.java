/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Izzat
 */
public class GroceryStoreSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        InventoryManager Im = new InventoryManager();
        Im.loadFromFile("Inventory.txt");
        
        CartList cart = new CartList();
        
        boolean running = true ;
        while(running){
            System.out.println("");
            System.out.println("Manager options");
            System.out.println("1 - Add product into inventory   ");
            System.out.println("2 - Remove product from inventory   ");
            System.out.println("3 - Search product in inventory (NAME)  ");
            System.out.println("4 - Search product in inventory (ID)  ");
            System.out.println("5 - Update stock   ");
            System.out.println("6 - Display all product ");
            System.out.println("");
            System.out.println("Customer options");
            System.out.println("7 - Add item to cart");
            System.out.println("8 - Remove item from cart");
            System.out.println("9 - View cart");
            System.out.println("10 - Update quantity of item in cart ");
            System.out.println("11 - Undo cart");
            System.out.println("12 - Clear cart");
            System.out.println("13 - checkout ");
            System.out.println("");
            System.out.println("14 - Save and exit");
            System.out.println("Enter choice number : ");            
            int choice = input.nextInt();
            input.nextLine();
            System.out.println("");
            
            int id ;
            String name;
            double price;
            int stock;
            int qty ; 
            int diff ;
             
            switch(choice){
                case 1 :
                   
                    
                    System.out.println("ID : ");
                    id = input.nextInt();
                    input.nextLine();
                    
                    System.out.println("Name : ");
                    name = input.nextLine();
                    
                    System.out.println("Price : ");
                    price = input.nextDouble();
                   
                    
                    System.out.println("Stock : ");
                    stock = input.nextInt();
                    
                    Im.addProduct(new Product(id,name,price,stock));
                    
                    break;
                 
                case 2 :
                    
                    System.out.println("ID :");
                    id = input.nextInt();
                    Im.removeProduct(id);
                    break;
                
                case 3 :    
                    
                    System.out.println("Name : ");
                    name = input.nextLine();
                    ArrayList<Product> results = Im.searchByName(name);
                    if(results != null){
                    for (int i = 0; i < results.size(); i++) {
                        System.out.println(results.get(i));
                    }
                    }
                    break;
                    
                case 4 : 
                    
                    System.out.println("ID :");
                    id = input.nextInt();
                    Product found = Im.searchById(id);
                    if(found != null){
                        System.out.println(found);
                    }else{
                        System.out.println("Product not found.");
                    }
                    break ;
                    
                case 5 :
                    
                    System.out.println("ID : ");
                    id = input.nextInt();
                    if(Im.getProductById(id)!= null){
                    input.nextLine();
                    
                    System.out.println("Stock :");
                    stock = input.nextInt();
                    Im.updateStock(id, stock);
                    }else{
                        System.out.println("Invalid ID");
                    }
                    break;
                    
                case 6 :  
                    
                    Im.displayAll();
                    break;
                    
                case 7 :     
                    
                    System.out.println("ID : ");
                    id = input.nextInt();
                    if(Im.getProductById(id)!= null){
                    input.nextLine();
                   
                    System.out.println("Quantity : ");
                    qty = input.nextInt();
                    
                    if(Im.isAvailable(id, qty)){
                        cart.addItem(Im.getProductById(id), qty);
                        Im.updateStock(id, Im.getProductById(id).getStock()-qty);
                    }else{
                        System.out.println("Insufficient quantity. ");
                    }
                    
                    }else{
                        System.out.println("Invalid ID");
                    }
                    break;
                    
                case 8 :
                    
                    System.out.println("ID :");
                    id = input.nextInt();
                    if(cart.findItem(id) != null){
                    Im.updateStock(id, cart.findItem(id).quantity + Im.getProductById(id).getStock());
                    cart.removeitem(id);
                    }else{
                        System.out.println("Invalid ID");
                    }
                    break;
                    
                case 9 :
                    
                    cart.displayCart();
                    break;
                    
                case 10 :
                    
                    System.out.println("ID :");
                    id = input.nextInt();
                    
                    
                    if(cart.findItem(id) != null){
                      System.out.println("Quantity :");
                      qty = input.nextInt();  
                    if(qty==cart.findItem(id).quantity){
                        break;
                    }else if(qty<cart.findItem(id).quantity){
                        diff = cart.findItem(id).quantity - qty ;
                        Im.updateStock(id , Im.getProductById(id).getStock() + diff  );
                    }else{
                        diff = qty - cart.findItem(id).quantity ; 
                        if(Im.isAvailable(id, diff)){
                        Im.updateStock(id , Im.getProductById(id).getStock() - diff);    
                        }else{
                            System.out.println("The stock in sufficient");
                            break;
                        }
                    }
                    
                    cart.updateQuantity(id, qty);
                    
                    }else{
                        System.out.println("Invalid ID");
                    }
                    break;
                    
                case 11 :
                    if(!cart.isEmpty()){
                    Im.updateStock(cart.tail.p.getId(), Im.getProductById(cart.tail.p.getId()).getStock()+ cart.tail.quantity );
                    cart.undo();
                    }else{
                        System.out.println("Cart is empty.");
                    }
                    break;
                    
                case 12 :
                    CartNode temp = cart.head ;
                    for (int i = 0; i < cart.size; i++) {
                        Im.updateStock(temp.p.getId() ,  Im.getProductById(temp.p.getId()).getStock()  + temp.quantity );
                        temp= temp.next ;
                    }
                    cart.clear();
                    break;
                    
                case 13 :
                    if(!cart.isEmpty()){
                    cart.displayCart();
                    System.out.println("The total : " + cart.calculateTotal() );
                    Im.saveToFile("Inventory.txt");
                    cart.clear();
                    }else{
                        System.out.println("The cart is empty.");
                    }
                    break ;
                    
                case 14 :
                    
                    Im.saveToFile("Inventory.txt");
                    return;
                
                default :
                    System.out.println("Invalid choice.");
            }
        }
        
    }
}
