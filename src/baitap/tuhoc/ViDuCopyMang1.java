package baitap.tuhoc;

public class ViDuCopyMang1 {
    public static void main(String[] args){

        int[] diemToan = {1, 2, 3, 4, 5, 6};

        int[] diemToan1 = diemToan;

        for(int diem : diemToan1){
            System.out.print(diem + ", ");
        }
    }
    
}
