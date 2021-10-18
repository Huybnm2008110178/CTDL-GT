package vn.edu.giadinh.tuan07;

import com.huybnm2008110178.tuan04.SanPham;

public class DanhSachSanPhamTestDrive {
    public static void main(String[] args){

        DanhSachSanPham danhSachSanPham = new DanhSachSanPham();

        //danhSachSanPham.add(sanPham);
        //danhSachSanPham.add(1, sanPham);

        String str1 = "Mr Teo";
        
        String str2 = "Mr Ty";

        if(str1.equals(str2)){
            System.out.println("Không giống nhau");

        }

        danhSachSanPham.inDanhSachSanPham();

        SanPham sanPham = new SanPham();

        SanPham sanPham2 = new SanPham();

        sanPham = sanPham2;

        if(sanPham == sanPham2){
            System.out.println("Bằng nhau tại sao??????");


        }

        if(sanPham.equals(sanPham2)){
            //code
        }
    }
    
}
