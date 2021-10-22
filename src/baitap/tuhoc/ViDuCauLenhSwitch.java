package baitap.tuhoc;

public class ViDuCauLenhSwitch {
    public static void main(String[] args){

        int soChoNgoi = 4;
        String loaiXe;

        switch(soChoNgoi){
            case 2:
                 loaiXe = "Xe Thể Thao";
                 break;
            case 4:
                 loaiXe = "Sedan";
                 break;
            case 7:
                 loaiXe = "SUV";
                 break;
            default:
                 loaiXe = "Xe khác";
                 break;
            
        }
        System.out.println("Loại xe: " + loaiXe);
    }
    
}
