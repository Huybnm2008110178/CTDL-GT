package baitap.tuhoc;

import java.util.Scanner;

public class MinhHoaNhapXuat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Mời bạn nhập họ và tên: ");
        String name = input.nextLine();
        
        System.out.println("Mời bạn nhập tuổi: ");
        int age = input.nextInt();

        System.out.println("Mời bạn nhập lương của mình: ");
        double salary = input.nextDouble();

        System.out.println("Name= " + name);
        System.out.println("Age= " + age);
        System.out.println("Salary= " + salary);
        
    }
    
}
