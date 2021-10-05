package vn.edu.giadinh.tuan04;

import java.sql.Array;
import java.util.Arrays;

public class CTMinhHoaMang {
    public static void main (String[] args){
        //cú pháp khai báo mảng
        int[] mangSoNguyen; //chưa chỉ định số phân tử
        
        mangSoNguyen = new int[5]; //=> mảng trong java là 1 kiểu tham chiếu đối tượng

        double mangSoThuc[] = new double[10];
        
        //trước khi dùng thì phải xác định số phân tử của mảng
        mangSoNguyen[0] = 2;
        
        //KHAI BÁO CÓ KHỞI TẠO GIÁ TRỊ CHO MẢNG

        //mảng kiểu dữ liệu cơ bản
        double diemMonHoc[] = new double[]{10.5, 5.5, 3.0, 4.5};
        System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));
        diemMonHoc[0] = diemMonHoc[1];
        //5.5, 5.5, 3.0, 4.5

        System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));
        
        System.out.println("Số phân tử của mảng điểm môn học: " + diemMonHoc.length);

        //CÁCH 2
        String dsTenSinhVien[] = {"Tèo", "Tý", "Tửng"};
        
        //dùng vòng lặp để duyệt mảng
        System.out.println("============== DUYỆT MẢNG ------------------");
       
        for(int i = 0; i < diemMonHoc.length; i++){
            System.out.println(diemMonHoc[i]);
        }
        
        System.out.println("=================== FOR EACH =================");
        //FOR - EACH
        for(double diem : diemMonHoc){
            
            System.out.println(diem);
        
        }
        
        //mảng có kiểu dữ liệu tham chiếu đối tượng
        dog[] danhSachdog = new dog[7];

        dog dog0 = new dog(10, "Đen", "Fido");
        dog dog1 = new dog(7, "Trắng", "Shiro");
        dog dog2 = new dog(25, "Hồng", "Lulu");
        dog dog3 = new dog(4, "Vàng", "Pluto");
        dog dog4 = new dog(9, "Xanh", "Lucky");
        dog dog5 = new dog(6, "Trắng đen", "Dark");
        dog dog6 = new dog(15, "Tím", "Mực");

        danhSachdog[0] = dog0;
        danhSachdog[1] = dog1;
        danhSachdog[2] = dog2;
        danhSachdog[3] = dog3;
        danhSachdog[4] = dog4;
        danhSachdog[5] = dog5;
        danhSachdog[6] = dog6;
        
        danhSachdog[0].inThongTin();
        danhSachdog[1].inThongTin();
        danhSachdog[2].inThongTin();
        danhSachdog[3].inThongTin();
        danhSachdog[4].inThongTin();
        danhSachdog[5].inThongTin();
        danhSachdog[6].inThongTin();
    }
}
