package com.huybnm2008110178.tuan07;

public class MyLinkedList {
    Node head = null;
    Node tail = null;
    
    Node node = new Node();

    public MyLinkedList(){}

    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void print(){
        Node current = head;
        if(head == null){
            System.out.println("Danh sách rỗng ");
            return;
        }
        System.out.println("Các nút trong danh sách: ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    void search(int data){

    }
    void clearAll(){
        head = tail = null;
    }
    void removeHead(){
        head = head.next;
    }
    void removeTail(){
        Node temp = head;
        while(temp.next == tail){
            temp.next = null;
            tail = temp;
            break;
        }
        temp = temp.next;
    }

    
}
