package vn.edu.giadinh.tuan02;

import java.util.Scanner; //#include<stdio.h>

public class CTMinhHoaNhap {
    public static void main (String[] args){
        Scanner bienNhap; //Biến tham chiếu đối tượng
        double diemMonCTDLGT;
        //Tạo đối tượng
        //Toán tử new
        //Hàm tạo của lớp Scanner
        bienNhap = new Scanner(System.in);
        System.out.print("Nhập vào điểm môn CTDL & GT: ");
        diemMonCTDLGT = bienNhap.nextDouble();

        System.out.println("Điểm vừa nhập vào là: " + diemMonCTDLGT);

        String chuoi = new String("Hello Mí bạn");

        //String chuoi;
        int tuoi;
        //double diemMonCTDLGT;
        Integer integer;

        Double double1;

        Boolean boolean1;

        Float float1;
    }
}
