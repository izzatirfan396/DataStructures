/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.Scanner;

/**
 *
 * @author Izzat
 */
public class StackPalindrome {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
      
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a String with <= 15 character only : ");
        String str = k.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
        }
        for (int i = 0 ; i <str.length() ; i++) {
            if(!stack.pop().equals(str.charAt(i))){
                System.out.println("The string " + str + " is not Palindrome");
                return;
            }
        }
        System.out.println("The string " + str + " is Palindrome");
        
    }
}
