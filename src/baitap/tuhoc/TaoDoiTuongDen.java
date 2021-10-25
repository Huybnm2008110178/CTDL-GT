package baitap.tuhoc;

public class TaoDoiTuongDen {
    public static void main(String[] args){
        
        //Tạo đối tượng den từ class Den
        Den den = new Den();

        //Bật đèn
        den.batDen();

        //Thông báo trạng thái của đèn
        den.thongBao();

        //Tắt đèn
        den.tatDen();

        //Thông báo trạng thái của đèn
        den.thongBao();
    }
    
}
