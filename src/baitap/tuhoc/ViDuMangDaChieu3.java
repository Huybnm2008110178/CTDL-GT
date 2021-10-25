package baitap.tuhoc;

public class ViDuMangDaChieu3 {
    public static void main(String[] args){

        int[][] a = {
            {2, 3, 4},
            {3, 4, 3, 5},
            {3},
        };

        for(int[] mangCon : a){
            for(int giaTri : mangCon){
                System.out.println(giaTri);
            }
        }
    }
    
}
