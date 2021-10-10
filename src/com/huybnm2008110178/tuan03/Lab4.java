package com.huybnm2008110178.tuan03;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        
        String []a = new String[n];
        for (int i=0; i<n; i++){
            System.out.println("Họ và tên học sinh thứ " + i);
            scanner.nextLine();
            a[i] = scanner.nextLine();
        }

        double []b = new double [n];
        for (int i=0; i<n; i++){
            System.out.println("Điểm của học sinh thứ " + i);
            b[i] = scanner.nextDouble();
        }

        for(int i=0; i<n; i++){
            if(b[i] <5){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : Yếu");
            
            }
            else if(5 <= b[i]&&b[i] < 6.5){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : Trung bình");

            }
            else if(6.5 <= b[i]&&b[i] < 7.5){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : Khá");

            }
            else if(7.5 <= b[i]&&b[i] < 9){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : Giỏi");

            }
            else if(b[i] >= 9){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : Xuất sắc");
            }
        }
    }
    
}
