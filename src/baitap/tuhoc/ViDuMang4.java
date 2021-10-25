package baitap.tuhoc;

public class ViDuMang4 {
    public static void main(String[] args){

        int[] diemToan = {9, 8, 1, 7, 4};

        int tong = 0;
        Double diemTrungBinh;

        for(int diem : diemToan){
            tong += diem;
        }

        int doDaiMang = diemToan.length;

        diemTrungBinh = ((double)tong / (double)doDaiMang);

        System.out.println("Tổng điểm = " + tong);
        System.out.println("Điểm trung bình môn Toán = " + diemTrungBinh);      
    }
    
}
