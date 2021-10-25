package vn.edu.giadinh.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args){

        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(8);

        queue.add(10);

        queue.add(2);

        //Lấy ra 1 phần tử - trong queue - lấy đầu

        System.out.println(queue);

        int phanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra từ Queue " + phanTuDuocLayRa);

        System.out.println("Phần tử còn lại trong Queue");

        System.out.println(queue);

        //thăm 1 phần tử Queue - không loại khỏi queue
        int phanDuocTham = queue.peek();

        System.out.println("Phần tử vừa được thăm " + phanDuocTham);

        System.out.println("Phần tử còn lại trong Queue sau khi thăm ");

        System.out.println(queue);

        //Cài đặt Linked List,Queue,book
              //Thêm 1 phần tử vào cuối
              //Lấy 1 phần tử đầu
              //Xóa 1 phần tử đầu

        //Dùng Linked List để cài đặt cấu trúc Stack
        //Cài đặt Linked List
              //Thêm 1 phần tử vào cuối
              //Lấy 1 phần tử cuối
              //Xóa 1 phần tử cuối
    }
    
}
