package vn.edu.giadinh.tuan07;

public class MyLinkedList {

    Node head = null;
    Node tail = null;
    

    public MyLinkedList(){}


    void add(int data){

        //Tạo 1 Node mới
        Node newNode = new Node(data);

        if(head == null){ //Thêm 1 nút vào danh sách rỗng
            head = newNode;
            tail = newNode;

        }else{ //danh sách không rỗng  //Thêm vào đuôi danh sách
            tail.next = newNode;
            tail = newNode;

        }

    }

    void remove(){

    }

    void print(){

        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Các nút trong danh sách: ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }

    void find (){

    }
}
