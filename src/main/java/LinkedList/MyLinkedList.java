/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Izzat
 */
public class MyLinkedList<E> {
    
    Node<E> head = null;
    Node<E> tail = null;
    int size = 0 ; 
    public MyLinkedList(){
    
    }
    
    public void addFirst(E e){
        
        Node<E> newNode = new Node<>(e);
        if(head == null){
            
            head = tail = newNode ;
          
        }else{
            
            newNode.next = head;
            head = newNode ;
            
        }
        
        size ++ ;
    
    }
    
    public void addLast(E e){
        
        Node<E> newNode = new Node<>(e);
        if(head == null){
            
            head = tail = newNode ;
          
        }else{
            
            tail.next = newNode;
            tail = newNode ;
            
        }
        size ++;
    
    }
    
    public void add(int index, E e) {
        
        if(index < 0 || index > size ){
        throw new IndexOutOfBoundsException();
        }
            
    if (index ==0){
    addFirst(e);
    }else if(index==size){
    addLast(e);
    }else{
    Node<E> newNode= new Node<>(e);
    Node<E> current = head;
    for(int i = 1; i < index ; i++){
    current = current.next;
    }
    newNode.next = current.next; 
    current.next = newNode;
    size++; 
    }
}
    
    
public E removeFirst(){ 
    Node<E> temp;
if(head == null){ 
    return null; 
}else{
temp = head;
head = head.next;
if (head == null){
tail = head;
}
size -- ;
}

return temp.element;
}
     public E removeLast(){
Node<E> temp;
if(head==null){ 
    return null;
}else if (head==tail){
temp = head; 
head=tail=null;
size-- ;
return temp.element ;
}else{
Node<E> current = head;
for(int i = 1; i<size-1 ; i++){
current = current.next;
}
temp = current.next;
current.next = null; tail = current; 
size--;
return temp.element;
}
    
}    
     
     
public E remove(int index) {
Node<E> temp;
if(index < 0 || index >= size){
return null;
}
else if(index==0){
return removeFirst();
}
else if(index == (size-1)){ 
    return removeLast();
}
else{
Node<E> current=head ;
for(int i = 1; i<index ; i++){
current = current.next;
}
temp = current.next; 
current.next = temp.next;
}
size--;
return temp.element ;
}

public void add(E e){

    addLast(e);
    
}

public boolean contains(E e ){
    
    Node<E> current = head ; 
    for (int i = 0; i < size; i++) {
        if(current.element.equals(e) ){
            return true ;
        }
        current = current.next ;
        
    }
    
    return false ; 
    
}

public E get(int index){
    Node<E> temp ;
    if(index<0 || index >= size){
        throw new IndexOutOfBoundsException();
    }else{
        temp = head;
        for (int i = 0; i <=index ; i++) {
            if(i==index){
                break;
            }
            temp=temp.next ;
        }
        
    }
    return temp.element ;
}

public E getFirst(){
    return get(0);
}

public E getLast(){
    return get(size-1);
}

public int indexOf(E e){
    int count = 0 ;
    Node<E> temp = head ;
    for (int i = 0; i < size; i++) {
        if(temp.element.equals(e)){
            return count ;
        }
        temp = temp.next ;
        count++;
    }
    return -1 ;
}

public int lastIndexOf(E e){
    int index = 0 ;
    int lastIndex = -1 ;
    Node<E> temp = head ;
    for (int i = 0; i < size; i++) {
        if(temp.element.equals(e)){
            lastIndex = index ;
        }
        index++;
        temp = temp.next;
    }
    return lastIndex ;
}

public E set(int index , E e){
    add(index , e);
    return remove( index + 1 );
}

public void clear(){
    
    Node<E> temp = head ;
    for (int i = 0; i < size; i++) {
        temp = head.next ; 
        head.next = null ; 
        head = temp;
    }
    tail = null ;
    size=0;
    
}

public void print(){
    Node<E> temp =head;
    for (int i = 0; i < size; i++) {
        System.out.print(temp.element + " ");
        temp = temp.next ; 
    }
    System.out.println();
     
}

public void reverse(){
    
    reverseHelper(head);
    System.out.println();
}    

private void reverseHelper(Node<E> node){
        
    if(node == null){
        return;
    }
    
    reverseHelper(node.next);
    System.out.print(node.element + " ");

}
    
}
     

