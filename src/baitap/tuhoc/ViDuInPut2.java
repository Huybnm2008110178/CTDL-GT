package baitap.tuhoc;

import java.util.Scanner;

public class ViDuInPut2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập 1 số Float: ");
        float soFloat = input.nextFloat();
        System.out.println("Số Float bạn vừa nhập là: ");

        System.out.print("Nhập 1 số Double: ");
        double soDouble = input.nextDouble();
        System.out.println("Số Double bạn vừa nhập là: ");

        System.out.print("Nhập 1 chuỗi: ");
        String chuoiString = input.next();
        System.out.println("Chuỗi bạn vừa nhập là: ");
    }
    
}
