package baitap.tuhoc;

public class ViDuVongLapWhile2 {
    public static void main(String[] args){

        int tong = 0, i = 100;

        while(i != 0 ){
            tong += i; //tổng = tổng + i
            i--;
        }
        System.out.println("Tổng= " + tong);
    }
    
}
