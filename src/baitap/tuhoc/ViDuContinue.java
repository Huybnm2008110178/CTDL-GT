package baitap.tuhoc;

public class ViDuContinue {
    public static void main(String[] args){

        for(int i = 1; i <= 10; i++){

            if(i > 4 && i < 9){ //Bỏ qua 5,6,7,8
                continue;
            }

            System.out.println(i);
        }
    }
    
}
