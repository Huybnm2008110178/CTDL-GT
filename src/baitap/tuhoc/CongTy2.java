package baitap.tuhoc;

public class CongTy2 {
    String tenMien;

    public CongTy2(){
        this.tenMien = "mặc định";
    }

    public CongTy2(String tenMien){
        this.tenMien = tenMien;
    }

    public void layTenMien(){
        System.out.println(this.tenMien);
    }

    public static void main(String[] args){
        CongTy2 ctyMacDinh = new CongTy2();
        CongTy2 niit = new CongTy2("niithanoi.edu.vn");

        ctyMacDinh.layTenMien();
        niit.layTenMien();
    }
    
}
