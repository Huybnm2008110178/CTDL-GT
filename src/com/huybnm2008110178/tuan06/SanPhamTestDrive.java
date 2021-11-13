package com.huybnm2008110178.tuan06;

import java.util.Scanner;

public class SanPhamTestDrive {
    static Scanner scanner = new Scanner(System.in);
    static SanPham sanpham = new SanPham();
    static int luaChon;

    public static void main(String[] args){
        System.out.println("Số lượng sản phẩm: ");
        sanpham.sp = scanner.nextInt();
        SanPham[] DSSP = new SanPham[sanpham.sp];
        do{
            System.out.println("--------------MENU--------------");
            System.out.println("1. Nhập danh sách sản phẩm ");
            System.out.println("2. Sắp xếp tăng dần ");
            System.out.println("3. Tìm và xóa sản phẩm ");
            System.out.println("4. Xuất giá trị trung bình ");
            System.out.println("5. Thêm vào vị trí bất kỳ ");
            System.out.println("6. Kết thúc ");
            System.out.println("Nhập lựa chọn ");
            luaChon = scanner.nextInt();
            switch(luaChon){
                case 1:
                     nhap(DSSP);
                     break;
                case 2:
                     sapXep(DSSP);
                     break;
                case 3:
                     timVaXoa(DSSP);
                     break;
                case 4:
                     xuatGiaTri(DSSP);
                     break;
                case 5:
                     them(DSSP);
                     break;
                case 6:
                     break;           
            }
            System.out.println("Trở lại MENU?? YES:1/NO:0");
            luaChon = scanner.nextInt();
        }while(luaChon == 1);
    }
    static void nhap(SanPham DSSP[]){
        for(int i = 0; i < sanpham.sp; i++){
            DSSP[i] = new SanPham();
            DSSP[i].nhapThongTin();
        }

    }
    static void sapXep(SanPham DSSP[]){
        SanPham tam;
        for(int i = 0; i < sanpham.sp; i++){
            for(int j = i + 1; j < sanpham.sp; j++){
                if(DSSP[i].donGia > DSSP[j].donGia){
                    tam = DSSP[i];
                    DSSP[i] = DSSP[j];
                    DSSP[j] = tam;
                }
            }
        }
        System.out.println("Danh sách sau khi tăng dần: ");
        for(int i = 0; i < sanpham.sp; i++){
            DSSP[i].inThongTin();
        }
    }
    static void timVaXoa(SanPham DSSP[]){
        System.out.println("Nhập tên sản phẩm muốn xóa: ");
        scanner.nextLine();
        String ten = scanner.nextLine();
        for(int i = 0; i < sanpham.sp; i++){
            if((DSSP[i].tenSanPham).equals(ten)){
                for(int j = i; j < sanpham.sp; j++){
                    DSSP[j] = DSSP[j + 1];
                     
                }
            }
        }
        System.out.println("Đã xóa thành công ");
        sanpham.sp--;
    }
    static void xuatGiaTri(SanPham DSSP[]){
        SanPham[] new_DSSP = new SanPham[sanpham.sp+1];
        System.out.println("Nhập vào vị trí muốn thêm: ");
        int viTri = scanner.nextInt();
        for(int i = sanpham.sp; i > viTri; i++){
            new_DSSP[i] = DSSP[i-1];
        }
        new_DSSP[viTri] = new SanPham();
        new_DSSP[viTri].nhapThongTin();
        for(int i = 0; i < viTri; i++){
            new_DSSP[i] = DSSP[i];
        }
        sanpham.sp++;
        for(SanPham x : new_DSSP){
            x.inThongTin();
            break;
        }
    }
    static void them(SanPham DSSP[]){
        double tong = 0;
        for(int i = 0; i < sanpham.sp; i++){
            tong = tong + DSSP[i].donGia;
        }
        System.out.println("Giá trị trung bình của sản phẩm: " + tong/(sanpham.sp));
    }
    
}
