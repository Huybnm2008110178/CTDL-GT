package com.huybnm2008110178.tuan08;

import java.util.Stack;

public class StackDemoProgram {
    public static void main(String[] args){
        Stack<String> stack;

        stack = new Stack<>();

        stack.push("Wellcome");

        stack.push("To");

        stack.push("Data structure and Alotihm");

        System.out.println(stack);

        String poped = stack.pop();

        System.out.println("Lấy ra từ stack: " + poped);

        System.out.println("Danh sách còn lại: " + stack);

        String phanTuDuocTham = stack.peek();

        System.out.println("Thăm phần tử đỉnh: " + phanTuDuocTham);
    }
    

    
    
}
