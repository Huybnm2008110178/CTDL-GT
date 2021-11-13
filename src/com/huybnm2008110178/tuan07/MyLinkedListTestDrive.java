package com.huybnm2008110178.tuan07;

public class MyLinkedListTestDrive {
    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(3);
        myLinkedList.add(8);
        System.out.println("danh sách ban đầu ");
        myLinkedList.print();
        System.out.println();

        myLinkedList.addFirst(5);
        System.out.println("Thêm vào đầu danh sách ");
        myLinkedList.print();
        System.out.println();

        myLinkedList.add(10);
        System.out.println("Thêm vào cuối danh sách ");
        myLinkedList.print();
        System.out.println();

        myLinkedList.removeHead();
        System.out.println("Xóa ở đầu danh sách ");
        myLinkedList.print();
        System.out.println();

        myLinkedList.removeTail();
        System.out.println("Xóa ở cuối danh sách ");
        myLinkedList.print();
        System.out.println();

        myLinkedList.clearAll();
        System.out.println("Xóa tất cả danh sách ");
        myLinkedList.print();
        System.out.println();

    }
    
}
