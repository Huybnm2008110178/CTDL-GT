package vn.edu.giadinh.tuan10;

public class AppleLinkList {

    Node head = null;

    Node tail = null;

    public AppleLinkList(){

    }

    boolean isEmpty(){

        boolean empty = true;

        if(head == null){
            return true;
        }else{
            empty = false;
        }

        return empty;
    }

    public void addFirst(Apple apple){

        Node newNode = new Node(apple);

        if(isEmpty()){
            head = newNode;
            tail = newNode;            

        }else{

            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Apple apple){

        Node newNode = new Node(apple);

        if(isEmpty()){
            if(isEmpty()){
                head = newNode;
                tail = newNode;            
    
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
        
    }

    public Node findAppleById(int id){
        Node node = null;

        if(isEmpty()){
            System.out.println("List is empty! ");
        }else{

            Node current;
            current = head;
            while(current.data.id == id){
                node = current;
            }
            current = current.next;
        }
        return node;

        
        
    }


    

}
