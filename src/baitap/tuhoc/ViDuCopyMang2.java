package baitap.tuhoc;

public class ViDuCopyMang2 {
    public static void main(String[] args){

        int[] diemToan = {1, 2, 3, 4, 5, 6};

        int[] diemToan1 = diemToan;

        diemToan[0] = 10;

        System.out.print("Mảng diemToan1: ");

        for(int diem: diemToan1){
            System.out.print(diem + ",");
        }

        diemToan1[2] = 10;

        System.out.print("\n" + "Mảng diemToan: ");

        for(int diem : diemToan){
            System.out.print(diem + ",");
        }
    }
    
}
