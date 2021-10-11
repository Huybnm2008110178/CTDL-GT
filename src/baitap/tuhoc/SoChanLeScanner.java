package baitap.tuhoc;

import java.util.Scanner;

public class SoChanLeScanner {
    public static void main(String[] args){
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        i = scanner.nextInt();

        if(i%2 == 0){
            System.out.println("Đây là số chẵn " + i);
        }else{
            System.out.println("Đây là số lẻ " + i);
        }
    }
    
}
