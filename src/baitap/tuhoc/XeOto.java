package baitap.tuhoc;

public class XeOto {
    String thuongHieu;

    XeOto(String thuongHieu){
        this.thuongHieu = thuongHieu;
        System.out.println("Thương hiệu xe ô tô " + this.thuongHieu + " ra đời");

    }
    public static void main(String[] args){
        XeOto xe1 = new XeOto("Vinfast");
        XeOto xe2 = new XeOto("Tesla");
        XeOto xe3 = new XeOto("BMW");
    }
    
}
