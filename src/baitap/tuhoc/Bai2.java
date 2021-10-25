package baitap.tuhoc;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){

        int chieuDai, chieuRong;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        chieuDai = input.nextInt();
        System.out.print("Nhập chiều rộng: ");
        chieuRong = input.nextInt();

        int chuVi = (chieuDai + chieuRong)*2;
        int dienTich = chieuDai * chieuRong;
        int canhNhoNhat = Math.min(chieuDai,chieuRong);

        System.out.println("chu vi = " + chuVi);
        System.out.println("diện tích = " + dienTich);
        System.out.println("cạnh nhỏ nhất = " + canhNhoNhat);
        
    }
    
}
