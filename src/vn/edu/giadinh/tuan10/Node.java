package vn.edu.giadinh.tuan10;

public class Node {

    //nội dung / dữ liệu
    Apple data;

    Node next;

    //liên kết

    public Node(){
        data = null;
        next = null;
    }

    public Node(Apple apple){
        data = apple;
        next = null;
    }

    public Node(Apple apple, Node node){
        data = apple;
        next = node;
    }
    
}
