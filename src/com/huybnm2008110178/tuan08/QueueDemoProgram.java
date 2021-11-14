package com.huybnm2008110178.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);

        System.out.println(queue);

        int phanTuLayRa = queue.remove();

        System.out.println("Phần tử lấy ra: " + phanTuLayRa);

        System.out.println("Phần tử còn lại: " + queue);

        int phanTuDuocTham = queue.peek();

        System.out.println("Phần tử được thăm: " + phanTuDuocTham);

        System.out.println("Phần tử còn lại: " + queue);
    }
    
}
