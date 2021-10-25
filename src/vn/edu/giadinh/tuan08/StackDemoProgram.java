package vn.edu.giadinh.tuan08;

import java.util.Stack;

import vn.edu.giadinh.tuan04.Student;

public class StackDemoProgram {
    public static void main(String[] args){
        Stack<String> stack;

        stack = new Stack<>();

        stack.push("welcome"); //push: thêm phần tử vào stack

        stack.push("To");

        stack.push("Data structure and Algotimhm");

        System.out.println(stack);

        String poped = stack.pop(); //pop: lấy ra 1 phần tử đỉnh stack (xóa phần tử khỏi stack)

        System.out.println("Đã lấy ra từ danh stack " + poped);

        System.out.println("Phần tử còn lại của Stack");
        
        System.out.println(stack);


        //Thăm nút đỉnh // không loại khỏi danh sách
        String phanTuDuocTham = stack.peek();
        System.out.println("Thăm phần tử đỉnh: " + phanTuDuocTham);

        System.out.println(stack);

        Stack<Student> stack2;
    }
    
}
