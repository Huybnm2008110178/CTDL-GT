package baitap.tuhoc;

import java.util.Arrays;

public class ViDuCopyMang4 {
    public static void main(String[] args){
        int[] n1 = {1, 2, 3, 4, 5, 6};

        int[] n3 = new int[5];

        int[] n2 = new int[n1.length];

        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("Mảng n2 = " + Arrays.toString(n2));

        System.arraycopy(n1, 2, n3, 1, 2); //Sao chép 2 phần tử mảng n1, bắt đầu từ phần tử 2
        System.out.println("Mảng n3 = " + Arrays.toString(n3));
    }
    
}
