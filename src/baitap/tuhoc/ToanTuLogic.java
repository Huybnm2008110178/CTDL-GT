package baitap.tuhoc;

public class ToanTuLogic {
    public static void main(String[] args){
        int so1 = 1, so2 = 2, so3 = 4;
        boolean ketQua;
        ketQua = (so1 >so2) || (so3 > so2);
        System.out.println("Kết quả OR = " + ketQua);

        ketQua = (so1 >so2) && (so3 > so2);
        System.out.println("Kết quả AND = " + ketQua);
    }
    
}
