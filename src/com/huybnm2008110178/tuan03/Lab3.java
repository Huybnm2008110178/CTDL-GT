package com.huybnm2008110178.tuan03;

import java.util.Scanner;

public class Lab3{
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 mảng số nguyên: ");
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Nhập 1 phần tử thứ: " + i);
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        for (int i=0; i<n; i++){
            if (min<a[0]){
               int Min = Math.min(min, a[i]);
            }
        }
        int sum=0;
        int count=0;
        System.out.println("Số nhỏ nhất trong mảng: " + min);
        for (int i=0; i<n; i++){
            if (a[i] % 3 == 0){
                sum = sum + a[i];
                count ++;
            }
        }
        
        double ketqua = sum/count;
        System.out.println("Kết quả: " + ketqua);

    }

    
    
}
