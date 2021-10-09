package com.huybnm2008110178.tuan03;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        
        int x,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        x = scanner.nextInt();

        for(i=1; i<=10;i++){
            System.out.printf("%d x %d = %d",x,i,x*i);
            System.out.println();
        }

    }
    
}
