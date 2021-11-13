package com.huybnm2008110178.tuan5;

public class sinhvien {
    String hoTen;
    String lop;
    Double diemTB;

    public sinhvien(){}

    public sinhvien(String name, String Lop, Double diem){
        hoTen = name;
        lop = Lop;
        diemTB = diem;

    }
    
    public void inThongTin(){
        System.out.println("Họ và tên: " + hoTen + " lớp: " + lop + " điểm TB: " + diemTB);
    }

     
    
}
