package baitap.tuhoc;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){

        int canh;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cạnh: ");
        canh = input.nextInt();

        int theTich = canh*canh*canh;

        System.out.println("Thể tích lập phương = " + theTich);
    }
    
}
