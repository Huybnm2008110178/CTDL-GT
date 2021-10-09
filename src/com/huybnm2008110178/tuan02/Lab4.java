package com.huybnm2008110178.tuan02;

import java.util.Scanner;

public class Lab4 {
    public static void main (String[] args){
        System.out.println("=============Menu=============");
        System.out.println(">>1. giải phương trình bậc I");
        System.out.println(">>2. giải phương trình bậc II");
        System.out.println(">>3. tính tiền điện");
        System.out.println("=============Menu=============");
        int SuLuaChon;
        System.out.print("lựa chọn chức năng:");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        SuLuaChon = bienNhap.nextInt();
        
        switch(SuLuaChon){
             case 1: giaiPTBacI(); break;
             case 2: giaiPTBacII(); break;
             case 3: tinhTienDien(); break;
             default: System.out.println("chọn chức năng khác");
        }
    }

    static void giaiPTBacI(){
        float a = 0, b = 0;

        if( a == 0){
            if( b == 0){
                System.out.println("PT vô số nghiệm...");
            }
        }
    }

    static void giaiPTBacII(){
        System.out.println("triển khai code giải phương trình bậc II...");
    }

    static void tinhTienDien(){
        System.out.println("triển khai code tính tiền điện....");
    }
    
}
