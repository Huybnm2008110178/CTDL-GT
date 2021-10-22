package baitap.tuhoc;

import java.util.Scanner;

public class ViDuContinue2 {
    public static void main(String[] args){

        Double so, tong = 0.0;
        Scanner input = new Scanner(System.in);
        
        for(int i = 1; i < 6; i++){
            System.out.print("Nhập vào một số dương: ");
            so = input.nextDouble();

            if(so <= 0.0){ //nếu số nhỏ hơn hoặc bằng 0.0 thì sẽ bỏ qua
                continue;
            }
            tong += so;
        }
        System.out.println("Tổng= " + tong);
    }
    
}
