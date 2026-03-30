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
    private Dispenser candy;
    private Dispenser chip;
    private Dispenser gum ;
    private Dispenser cookies ; 
    private CashRegister register ;
    
    public CandyMachine(){
        candy = new Dispenser("Candy", 2.30 , 10);
        chip = new Dispenser("Chip", 3.50 , 10);
        gum = new Dispenser("Gum", 1.5 , 10);
        cookies = new Dispenser("Cookies", 4 , 10);
        register = new CashRegister();
    }
    
    public void showMenu(){
    System.out.printf("1. %-10s RM %.2f\n", candy.getName(), candy.getPrice());
    System.out.printf("2. %-10s RM %.2f\n", chip.getName(), chip.getPrice());
    System.out.printf("3. %-10s RM %.2f\n", gum.getName(), gum.getPrice());
    System.out.printf("4. %-10s RM %.2f\n", cookies.getName(), cookies.getPrice());
    }
    
    public void operate(){
        this.showMenu();
        Scanner tap = new Scanner(System.in);
        System.out.println("Press 1 for candy , Press 2 for chip , Press 3 for gum , Press 4 for cookies");
        int choice = tap.nextInt();
        
        Dispenser selected ;
        
        switch (choice) {
            case 1 :
                selected = candy ;
                break;
                
            case 2 :
                 selected = chip ;
                 break;
                 
            case 3 :
                selected = gum ; 
                break ;
                
            case 4 :
                selected = cookies ;
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
    
    

