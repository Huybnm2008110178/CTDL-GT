package baitap.tuhoc;

import java.util.Scanner;

public class ViDuSwitchCase {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào 1 ngày: ");
        int day = input.nextInt();

        switch(day){
            case 1:
                 System.out.println("Thứ 2");
                 break;
            case 2:
                 System.out.println("Thứ 3");
                 break;
            case 3:
                 System.out.println("Thứ 4");
                 break; 
            case 4:
                 System.out.println("Thứ 5");
                 break;  
            case 5:
                 System.out.println("Thứ 6");
                 break; 
            case 6:
                 System.out.println("Thứ 7");
                 break;  
            case 7:
                 System.out.println("Chủ nhật");
                 break;
            default:
                System.out.println("không có ngày này");    
        }
    }
    
}
