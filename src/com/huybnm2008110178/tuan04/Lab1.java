package com.huybnm2008110178.tuan04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        
        int n;
        double number, sum = 0;
        ArrayList<Double> arrlistDouble = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử ArrayList: ");
        n = scanner.nextInt();

        for( int i=0; i<n; i++){
            System.out.println("Nhập phần tử thứ " + i + ":");
            number = scanner.nextDouble();
            arrlistDouble.add(number);
        }

        for (double element : arrlistDouble){
            sum += element;

        }
        System.out.println("Tổng của các phần tử: " + sum);
    }
    
}
