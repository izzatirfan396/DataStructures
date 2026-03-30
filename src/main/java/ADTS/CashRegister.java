/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

/**
 *
 * @author Izzat
 */
public class CashRegister {
   
    private double itemPrice ;
    private double currentPayment ;
    private double balance ;
    
    public CashRegister(){
        this.balance = 100.0;
    }
    
    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice ;
    }
    
    public void acceptPayment(double payment){
      currentPayment += payment ;
    }
    
    public double getPayment(){
        return currentPayment;
    }
    
    public boolean isEnough(){
        return currentPayment >= itemPrice ;
    }
    
    public void giveChange(){
       double change = currentPayment - itemPrice ;
       if(change > balance){
           System.out.println("Not enough balance to give change!");
       }else{
       balance -= change ;
        System.out.printf("The change : RM %.2f\n" , change);
       }
    }
}
