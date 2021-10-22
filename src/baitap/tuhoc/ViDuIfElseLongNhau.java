package baitap.tuhoc;

public class ViDuIfElseLongNhau {
    public static void main(String[] args){

        int a = 9, b = 5, c = 8, max;

        if(a >= b){
            if(a >= c){
                max = a;
            }else{
                max = c;
            }
        }else{
            if(b >= c){
                max = b;
            }else{
                max = c;
            }
        }
        System.out.println("Số lớn nhất: " + max);
    }
    
}
