package com.huybnm2008110178.tuan02;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        
        Double soDien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện sử dụng của tháng: ");
        soDien = scanner.nextDouble();

        if(soDien<50){
          Double tien = soDien*1000;
          System.out.println("Tiền điện phải trả: "+ tien);
        }
        else{
          Double tien = 50*1000 + (soDien - 50)*1200;
          System.out.println("Tiền điện phải trả: "+ tien);
        }
    }
    
}
