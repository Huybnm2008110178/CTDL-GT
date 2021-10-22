package baitap.tuhoc;

public class ViDuBreakLabel {
    public static void main(String[] args){

        vongLap1:
        for(int i = 1; i < 5; i++){

            vongLap2:
            for(int j = 1; j < 3; j++){
                System.out.println("i= " + i + " và j= " + j);

                if(i == 2){
                    break vongLap1;
                }
            }
        }

       
            
                
    }

}
