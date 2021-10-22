package baitap.tuhoc;

public class ViDuVongLapLongNhau {
    public static void main(String[] args){

        for(int i = 1; i <= 3; i++){
            System.out.println("Chương " + i);

            for(int j = 1; j <= 5; j++){
                System.out.println("Phần " + j);
                if(j == 3){
                    System.out.println("Thoát vòng lặp bên trong ");
                    break;
                }
            }
        }
        System.out.println("Kết thúc chương trình lặp ");
    }
    
}
