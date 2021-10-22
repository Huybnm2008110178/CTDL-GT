package baitap.tuhoc;

import java.util.Scanner;

public class ViDuBreak2 {
    public static void main(String[] args){

        Double so, tong = 0.0;
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.print("Nhập vào một số: ");
            so = input.nextDouble();

            if(so < 0.0){ //Nếu số nhỏ hơn 0.0 sẽ in ra tổng
                break;
            }
            tong += so;
        }
        System.out.println("Tổng= " + tong);
    }
    
}
