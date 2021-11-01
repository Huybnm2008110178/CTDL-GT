package baitap.tuhoc;

public class TinhBinhPhuongMotSo2 {
    public static void main(String[] args){
        int n, ketQua;

        n = 3;
        ketQua = TinhBinhPhuong(n);
        System.out.println("Bình phương của 3 là: " + ketQua);

        n = 4;
        ketQua = TinhBinhPhuong(n);
        System.out.println("Bình phương của 4 là: " + ketQua);
    }

    static int TinhBinhPhuong(int i){
        return i * i;
    }
    
}
