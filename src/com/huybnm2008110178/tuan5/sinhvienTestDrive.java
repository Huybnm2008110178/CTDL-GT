package com.huybnm2008110178.tuan5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class sinhvienTestDrive {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<sinhvien> sinhvienList = new ArrayList<sinhvien>();

    public static void main(String[] args){

        int luaChon;
        do{
            System.out.println("---------------Menu---------------");
            System.out.println("1. Nhập thông tin sinh viên ");
            System.out.println("2. In danh sách sinh viên ");
            System.out.println("3. In danh sách theo điểm ");
            System.out.println("4. Tìm sinh viên ");
            System.out.println("5. Tìm và sửa thông tin ");
            System.out.println("6. Tìm và xóa thông tin ");
            System.out.println("7. Kết thúc ");
            System.out.println("Nhập lựa chọn ");

            luaChon = scanner.nextInt();
            switch (luaChon){
                case 1:
                     nhap();
                     break;
                case 2:
                     inDS();
                     break;
                case 3:
                     inTheoDiem();
                     break;
                case 4:
                     tim();
                     break;
                case 5:
                     timVaSua();
                     break;
                case 6:
                     timVaXoa();
                     break;
                case 7:
                     System.out.println("Kết thúc. ");
                     break;
                default:
                     System.out.println("lựa chọn không phù hợp. ");
                     break;

            }
            System.out.println("trở lại menu YES=1/NO=0");
            luaChon = scanner.nextInt();
        }while(luaChon == 1);

    }
    static void nhap(){
        while(true){
            sinhvien SinhVien = new sinhvien();
            System.out.println("Nhập họ và tên: ");
            SinhVien.hoTen = scanner.nextLine();
            System.out.println("Nhập điểm TB: ");
            SinhVien.diemTB = scanner.nextDouble();
            sinhvienList.add(SinhVien);
            scanner.nextLine();
            System.out.println("Bạn muốn nhập tiếp?? YES=1/NO=0");
            if(scanner.nextLine().equals(0))
            break;

        }
    }
    static void inDS(){
        System.out.println("in danh sách: ");
        for(sinhvien x : sinhvienList){
            System.out.println("Tên sinh viên: " + x.hoTen);    
            System.out.println("Điểm TB: " + x.diemTB);

        }
    }
    static void inTheoDiem(){
        Comparator<sinhvien> comparator = new Comparator<sinhvien>() {
            @Override
            public int compare(sinhvien o1, sinhvien o2){
                return Double.compare(o1.diemTB, o2.diemTB);
            }
        };
        Collections.sort(sinhvienList,comparator);
        Collections.reverse(sinhvienList);
        inDS();

    }
    static void tim(){
        for(sinhvien x : sinhvienList){
            System.out.println("Nhập tên sinh viên cần tìm: ");
            if(scanner.nextLine().equals(x.hoTen))
            System.out.println("Họ và tên: " + x.hoTen);
            System.out.println("Điểm TB: " + x.diemTB);
        }
    }
    static void timVaSua(){
        for (sinhvien x : sinhvienList){
            System.out.println("Nhập tên cần sửa: ");
            if(scanner.nextLine().equals(x.hoTen)){
                System.out.println("Nhập điểm mới: ");
                x.diemTB = scanner.nextDouble();
                scanner.nextLine();
            }
        }
    }
    static void timVaXoa(){
        for(sinhvien x : sinhvienList){
            System.out.println("Nhập họ và tên cần xóa: ");
            if(scanner.nextLine().equals(x.hoTen))
            sinhvienList.remove(x);
        }
    }
    
    
}
