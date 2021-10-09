package com.huybnm2008110178.tuan01;

import java.util.Scanner;

public class Lab1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        System.out.printf("%s%f điểm",hoTen,diemTB);
    }
    
}
