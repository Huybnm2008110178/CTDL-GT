package com.huybnm2008110178.tuan02;

import java.util.Scanner;

public class Lab2 {
    public static void main (String[] args){
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        c= scanner.nextDouble();

        Double Delta = Math.pow(b,2)-4*a*c;
        
        if(Delta < 0){
            System.out.println("Phương trình vô nghiệm ");
        }
        else if(Delta == 0){
            Double x = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép " + x);
        }    
        else if(Delta > 0){
            Double x1 = (-b + Math.sqrt(Delta))/(2*a);
            Double x2 = (-b - Math.sqrt(Delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt " + x1 + x2);
        }
    }
    
}
