package com.huybnm2008110178.tuan1;

import java.util.Scanner;

public class Bai01Lab1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        System.out.println("họ và tên: " + hoTen);
        System.out.println("điểm TB: " + diemTB);
    }
}
