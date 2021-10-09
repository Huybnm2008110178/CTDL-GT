package com.huybnm2008110178.tuan01;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        int chieudai,chieurong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        chieudai = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        chieurong = scanner.nextInt();

        int chuvi = (chieudai + chieurong)*2;
        int dientich = chieudai*chieurong;
        int canhNhoNhat = Math.min(chieudai,chieurong);

        System.out.println("Chu vi: " + chuvi);
        System.out.println("diện tích: " + dientich);
        System.out.println("canhNhoNhat: " + canhNhoNhat);
    }
    
}
