package com.huybnm2008110178.tuan01;

import java.util.Scanner;

public class Bai3Lab1 {
    public static void main (String[] args){
        int Canh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh: ");
        Canh = scanner.nextInt();

        int TheTich = Canh*Canh*Canh;
        System.out.println("Thể tích của khối chữ nhật: " + TheTich);
    }
    
}
