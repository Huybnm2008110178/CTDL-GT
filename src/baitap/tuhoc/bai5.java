package baitap.tuhoc;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){

        Double a,b,c,x,x1,x2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập a: ");
        a = input.nextDouble();

        System.out.print("Nhập b: ");
        b = input.nextDouble();

        System.out.print("Nhập c: ");
        c = input.nextDouble();

        Double delta = Math.pow(b, 2) - 4*a*c;

        if(a == 0){
                System.out.println("Phương trình bậc nhất ");
        
        }else if(a != 0){
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm ");

            }else if(delta == 0){
                x = -b/(2*a);
                System.out.println("Phương trình có nghiệm kép" + x);
            
            }else if(delta > 0){
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Phương trình có 2 nghiệm phân biệt " + x1 + x2);
            }

        }

    }

}
