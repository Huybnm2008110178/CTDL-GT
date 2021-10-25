package baitap.tuhoc;

import java.util.Scanner;

public class bai1 {
    public static void main (String[] args ){

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = input.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        Double diemTB = input.nextDouble();

        System.out.println("Họ và tên: " + hoTen + " Điểm trung bình: " + diemTB);

    }
    
}
