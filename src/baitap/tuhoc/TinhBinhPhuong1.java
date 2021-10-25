package baitap.tuhoc;

public class TinhBinhPhuong1 {
    private static int tinhBinhPhuong1(int x){
        return x * x;
    }

    public static void main(String[] args){

        for(int i = 1; i <= 5; i++){

            int ketQua = tinhBinhPhuong1(i);
            System.out.println("Bình phương của " + i + " là: " + ketQua);
        }
    }
    
}
