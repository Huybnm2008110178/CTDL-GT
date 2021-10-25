package baitap.tuhoc;

public class Den {
    

    //Biến thể hiện
    private String denSang;
    
    //Phương thức bật đèn
    public void batDen(){
        denSang = "Đèn đang sáng";
    }

    //Phương thức tắt đèn
    public void tatDen(){
        denSang = "Đèn đang tắt";
    }

    public void thongBao(){
        System.out.println("Thông báo: "+ denSang);
    }
    
}
