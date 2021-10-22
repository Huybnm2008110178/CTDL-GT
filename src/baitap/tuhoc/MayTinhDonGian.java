package baitap.tuhoc;

import java.util.Scanner;

public class MayTinhDonGian {
    public static void main(String[] args){

        char phepTinh;
        double so1, so2, ketQua;

        Scanner input = new Scanner(System.in);
        System.out.print("Chọn phép tính (+,-,*,/): ");
        phepTinh = input.next().charAt(0);

        System.out.print("Nhập số 1 và số 2: ");
        so1 = input.nextDouble();
        so2 = input.nextDouble();

        switch(phepTinh){
            case '+':
                 ketQua = so1 + so2;
                 System.out.println(so1 + "+" + so2 + "=" + ketQua );
                 break;
            
            case '-':
                 ketQua = so1 - so2;
                 System.out.println(so1 + "-" + so2 + "=" + ketQua );
                 break;

            case '*':
                 ketQua = so1 * so2;
                 System.out.println(so1 + "*" + so2 + "=" + ketQua );
                 break;

            case '/':
                 ketQua = so1 / so2;
                 System.out.println(so1 + "/" + so2 + "=" + ketQua );
                 break;

            default:
                 System.out.println("Phép tính không hợp lệ. ");
                 break;
        }
    }
    
}
