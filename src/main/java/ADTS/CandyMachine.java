/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

import java.util.Scanner;

/**
 *
 * @author Izzat
 */
public class CandyMachine {
    private Dispenser []dispensers;
  
    private CashRegister register ;
    
    public CandyMachine(){
        dispensers=new Dispenser[]{new Dispenser("Candy", 2.30 , 10),new Dispenser("Chip", 3.50 , 10),new Dispenser("Gum", 1.5 , 10),
        new Dispenser("Cookies", 4 , 10)};
        
        register = new CashRegister();
    }
    
    public void showMenu(){
        for (int i = 0; i < dispensers.length; i++) {
    System.out.printf((i+1) + ". %-10s RM %.2f\n", dispensers[i].getName(), dispensers[i].getPrice());
    }
}
    
    public void operate(){
        this.showMenu();
        Scanner tap = new Scanner(System.in);
        System.out.println("Press 1 for candy , Press 2 for chip , Press 3 for gum , Press 4 for cookies");
        int choice = tap.nextInt();
        
        Dispenser selected ;
        
        switch (choice) {
            case 1 :
                selected = dispensers[0] ;
                break;
                
            case 2 :
                 selected = dispensers[1];
                 break;
                 
            case 3 :
                selected = dispensers[2] ; 
                break ;
                
            case 4 :
                selected = dispensers[3] ;
                break ;
                
            default :
                System.out.println("Invalid choice!");
                return ;
             
        }
        
        if(selected.isEmpty()){
            System.out.println("Sorry, sold out!");
            return ;
        }
        register.setItemPrice(selected.getPrice());
        double payment;
        
        while(!register.isEnough()){
            
        System.out.println("Please enter your payment : " );
        payment = tap.nextDouble();
        register.acceptPayment(payment);
        
        } 
        System.out.println("Please check the dispenser space for your " + selected.getName());
        selected.dispense();
        register.giveChange();
        }
       
            
        
        
        
    }
    
    

