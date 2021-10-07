package com.huybnm2008110178.tuan01;

import java.util.Scanner;

public class Bai03Lab1 {
    public static void main (String[] args){
        int Canh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh: ");
        Canh = scanner.nextInt();

        int TheTichLapPhuong = Canh*Canh*Canh;

        System.out.println("Thể tích lập phương: " + TheTichLapPhuong);

    }
    
}
