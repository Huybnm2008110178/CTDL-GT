package baitap.tuhoc;

import java.util.Arrays;

public class ViDuCopyMang3 {
    public static void main(String[] args){

        int[] diemToan = {1, 2, 3, 4, 5, 6};
        int[] diemVan = new int[6];

        for(int i = 0; i < diemToan.length; i++){
            diemVan[i] = diemToan[i];
        }

        System.out.println(Arrays.toString(diemVan)); //Chuyển đổi mảng thành chuỗi
    }
    
}
