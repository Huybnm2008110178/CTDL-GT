package baitap.tuhoc;

import java.util.Scanner;

public class ViDuVongLapDoWhile {
    public static void main(String[] args){

        Double so, tong = 0.0;
        Scanner input = new Scanner(System.in);
        
        //vòng lặp do while
        do{
            System.out.print("Nhập vào một số: ");
            so = input.nextDouble();
            tong += so;
        }while(so != 0.0); //bấm số khi nào ra 0.0 thì sẽ ra được tổng

        System.out.println("Tổng= " + tong);
    }
    
}
