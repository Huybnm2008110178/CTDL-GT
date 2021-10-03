package vn.edu.giadinh.tuan02;

public class SinhVienTestDrive {
    public static void main(String[] args){ 
       SinhVien sinhVien; //Khai báo biến tên SinhVien tham chiếu đối tượng kiểu SinhVien
       
       sinhVien = new SinhVien(); //Tạo đối tượng sinh viên trong vùng nhớ Heap
       sinhVien.mssv = "2008110178";
       sinhVien.tenSinhVien = "Bùi Nhật Minh Huy";
       sinhVien.queQuan = "TP.HCM";
       sinhVien.tuoi = 19;

       sinhVien.inThongTinSV();
    }
    
}
