package com.huybnm2008110178.tuan04;

public class SanPham {

        String tenSanPham;
        double donGia;
        double giamGia;
        float thueNhapKhau;

        public SanPham(){

        }

       /**
        * @param tenSanPham
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

        boolean equals (SanPham other){
            boolean match = true;

            if((tenSanPham.equals(other.tenSanPham)) && donGia == other.donGia){
                match = true;

            }else match = false;

            return match;
        }

    }
    

