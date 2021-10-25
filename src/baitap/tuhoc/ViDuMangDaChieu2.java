package baitap.tuhoc;

public class ViDuMangDaChieu2 {
    public static void main(String[] args){

        int[] [] a = {
            {2, 3, 4},
            {3, 3, 4, 5},
            {4},
        };

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.println("Phần tử a[" + i + "]" + "[" + j + "] là " + a[i][j]);
            }
        }
    }
    
}
