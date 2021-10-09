package com.huybnm2008110178.tuan02;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Double a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b = scanner.nextDouble();

        if(a == 0){
            if(b == 0){

                System.out.println("Phương trình có vô số nghiệm ");

            }
            else

                System.out.println("Phương trình vô nghiệm ");

        }
        else

            System.out.println("Phương trình có nghiệm: " + (-b/a));
    }
}
