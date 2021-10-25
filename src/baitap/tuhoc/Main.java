package baitap.tuhoc;

public class Main {
    public static void main(String[] args){
        System.out.println("Sắp gọi đến một phương thức");
        
        //Gọi phương thức
        myMethod();

        System.out.println("Phương thức thực thi thành công");
    }
    
    //Định nghĩa phương thức
    private static void myMethod() {
        System.out.println("Dòng này in từ trong myMethod");
    }
    
}
