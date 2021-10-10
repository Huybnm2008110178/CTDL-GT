package com.huybnm2008110178.tuan04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        
        Double N, sum = (double) 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số danh sách số thực: ");
        int n = scanner.nextInt();
        ArrayList<Double> a = new ArrayList<>();

        while(true){
            Double x = scanner.nextDouble();
            a.add(x);

            System.out.println("Nhập thêm số thực: ");
            if(scanner.nextLine().equals("số thực")){
                break;
            }

            for(double b:a){
                sum += b;
            }

        }
        System.out.println("Tổng số thực: " + sum);
    }
    
}
