package baitap.tuhoc;

import java.util.Arrays;

public class ViDuCopyMang5 {
    public static void main(String[] args){

        int[] mangNguon = {1, 2, 3, 4, 5};

        int[] mangDich1 = Arrays.copyOfRange(mangNguon, 0, mangNguon.length);
        System.out.println("Mảng mangDich1 = " + Arrays.toString(mangDich1));

        int[] mangDich2 = Arrays.copyOfRange(mangNguon, 2, 4);
        
        System.out.println("Mảng mangDich2 = " + Arrays.toString(mangDich2));
    }
    
}
