package vn.edu.giadinh.tuan02;

import java.sql.Date;

public class SinhVien {
    
      //1. thuộc tính - attribute

      String mssv;
      String tenSinhVien;
      int tuoi;
      
      boolean gioiTinh; //false

      String queQuan;

      Date ngaySinh; //Kiểu ngày tháng



      //2. phương thức - method - function
      //Kiểu trả về <tên hàm> <(danh sách tham số)>{......}
      void inThongTinSV(){
          System.out.println("Mã số sinh viên: " + mssv);
          System.out.println("Tên sinh viên: " + tenSinhVien);
          System.out.println("Tuổi: " + tuoi);
          System.out.println("Quê quán: " + queQuan);
          System.out.println("Ngày sinh:" + ngaySinh);

      }

    
}
