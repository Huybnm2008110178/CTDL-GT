package com.huybnm2008110178.tuan03;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        
        int i,N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên: ");
        N = scanner.nextInt();
        
        Boolean ok = true;
        for ( i = 2; i < N-1; i++){
            if(N % i == 0){
                ok = false;
                break;
            }
            i++;
        }
        System.out.println(ok);
    }
}
