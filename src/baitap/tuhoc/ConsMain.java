package baitap.tuhoc;

public class ConsMain {
    private int x;

    //Constructor
    private ConsMain(){
        System.out.println("Constructor được gọi");
        x = 10;
    }

    public static void main(String[] args){
        ConsMain obj = new ConsMain();
        System.out.println("giá trị của x = " + obj.x);
    }
    
}
