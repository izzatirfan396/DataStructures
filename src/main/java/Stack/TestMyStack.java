/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author Izzat
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stackC = new MyStack<>();
        stackC.push('a');
        stackC.push('b');
        stackC.push('c');
        System.out.println(stackC);
        System.out.println("'b' in the stack : " +stackC.search('b') );
        System.out.println("'k' in the stack : " +stackC.search('k') );
        
         MyStack<Integer> stackI = new MyStack<>();
        stackI.push(1);
        stackI.push(2);
        stackI.push(3);
        System.out.println(stackI);
        System.out.println("'6' in the stack : "+ stackI.search(6));
    }
}
