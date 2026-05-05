/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Izzat
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.print();
        list.reverse();
        System.out.println(list.size);
        System.out.println("the first value :"+list.getFirst());
        System.out.println("the last value :"+list.getLast());
        list.remove(2);
        System.out.println("the index location of second element :"+ list.indexOf('b'));
        System.out.println("the index location of last element :"+ list.indexOf('d'));
        System.out.println("have c ? "+ list.contains('c'));
        list.clear();
        list.add('h');
        list.add('e');
        list.add('l');
        list.add('l');
        list.add('o');
    }
}
