package baitap.tuhoc;

public class TinhBinhPhuongMotSo {
    public static void main(String[] args){

        int ketQua, n;
        
        n = 3;
        ketQua = tinhBinhPhuong(n);
        System.out.println("Bình phương của 3 là: " + ketQua);

        n = 4;
        ketQua = tinhBinhPhuong(n);
        System.out.println("Bình phương của 4 là: " + ketQua);
    }

    static int tinhBinhPhuong(int i) {
        return i * i;
    }
    
}
