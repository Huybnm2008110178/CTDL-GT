package baitap.tuhoc;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args){
        Double soDien;

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng: ");
        soDien = input.nextDouble();

        if(soDien < 50){
            Double tienDien = soDien*1000;
            System.out.println("Tổng số tiền: " + tienDien);

        }else{
            Double tienDien = 50*1000 + (soDien - 50)*1200;
            System.out.println("Tổng số tiền: " + tienDien);
        }
    }
    
}
