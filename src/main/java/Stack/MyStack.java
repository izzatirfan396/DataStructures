/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author Izzat
 */
public class MyStack<E> {
    
    private ArrayList<E> list ;
    
    
    public MyStack(){
        list = new ArrayList<>();
    }
    
    public void push(E o){
        list.add(o);
    }
    
    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        E temp = list.get(list.size()-1);
        list.remove(list.size()-1);
        return temp ; 
    }
    
    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(list.size()-1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
       return "stack : " + list.toString();
    }
    
    public boolean search (E o){
        for(int i =0;i<list.size();i++){
            if(list.get(i).equals(o)){
                return true;
            }
        }
        return false ;
    }
}
