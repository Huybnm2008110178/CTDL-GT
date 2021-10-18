package com.huybnm2008110178.tuan04;

public class SanPham {

        String tenSanPham;
        double donGia;
        double giamGia;
        float thueNhapKhau;

        SanPham(){

        }

       /**
        * @param tenShanPham
        * @param donGia
        * @param giamGia
        * @param thueNhapKhau
        */
        
        
        
        public SanPham(String tenSanPham,double donGia, double giamGia, float thueNhapKhau){
            
        }
        
        void inThongTin(){
            System.out.println("Tên SP: " + tenSanPham);
            System.out.println("Đơn giá: " + donGia);
            System.out.println("giảm giá: " + giamGia);
            System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
       
        }

    }
    

