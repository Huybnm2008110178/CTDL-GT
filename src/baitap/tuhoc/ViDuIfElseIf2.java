package baitap.tuhoc;

import java.util.Scanner;

public class ViDuIfElseIf2 {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập 1 số: ");
        int so = input.nextInt();

        if(so > 0){
            System.out.println("Đây là số dương");
        }else if(so < 0){
            System.out.println("Đây là số âm");
        }else{
            System.out.println("Đây là số 0");
        }
    }
    
}
