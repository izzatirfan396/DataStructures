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
public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner k = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int last = k.nextInt();
        for (int i = 1; i <= last; i++) {
            stack.push(i);
        }
        System.out.println("Size of stack : "+ stack.getSize());
        System.out.println("The content : ");
       while(!stack.isEmpty()) {
            System.out.print(stack.pop()+ " ");
        }
    }
}
