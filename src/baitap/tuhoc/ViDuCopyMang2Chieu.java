package baitap.tuhoc;

import java.util.Arrays;

public class ViDuCopyMang2Chieu {
    public static void main(String[] args){

        int[][] mangNguon = {
            {2, 3, 4},
            {3, 4, 3, 5},
            {3},
        };

        int[][] mangDich = new int[mangNguon.length][];

        for(int i = 0; i < mangDich.length; i ++){
            
            //Phân bố không gian cho mỗi hàng của mảng dịch
            mangDich[i] = new int[mangNguon[i].length];

            for(int j = 0; j < mangDich[i].length; j++){
                mangDich[i][j] = mangNguon[i][j];
            }
        
        }

        System.out.println(Arrays.deepToString(mangDich));

    }
    
}
