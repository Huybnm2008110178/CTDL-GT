package com.huybnm2008110178.tuan01;

import java.util.Scanner;

public class Bai4Lab1 {
    public static void main (String[] args){
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        c = scanner.nextDouble();
        
        Double Delta = Math.pow(b,2)-4*a*c;
        Double canDelta = Math.sqrt(Delta);

        System.out.println("Delta: " + Delta);
        System.out.println("căn của Delta: " + canDelta);
    }
    
}
