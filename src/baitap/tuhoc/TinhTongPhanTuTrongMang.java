package baitap.tuhoc;

public class TinhTongPhanTuTrongMang {
    public static void main(String[] args){

        int[] mangSoNguyen = {2, 0, 2, 0, 0, 3};
        int tong = 0;

        for(int soNguyen : mangSoNguyen){
            tong += soNguyen;
        }
        System.out.println("tổng= " + tong);
    }
    
}
