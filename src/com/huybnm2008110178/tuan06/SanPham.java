package com.huybnm2008110178.tuan06;

import java.util.Scanner;

import com.huybnm2008110178.tuan05.sinhvien;

public class SanPham {
    String tenSanPham;
    double donGia;
    double giamGia;
    String thue;
    int sp;
    
    Scanner scanner = new Scanner(System.in);
    SanPham(){}

    void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế: " + thue);

    }

    void nhapThongTin(){
        System.out.println("Thông tin của sản phẩm: ");
        System.out.println("Tên sản phẩm: ");
        tenSanPham = scanner.nextLine();
        System.out.println("Đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.println("Giảm giá: ");
        giamGia = scanner.nextDouble();
        System.out.println("Thuế: ");
        thue = scanner.nextLine();
    }
    
}
