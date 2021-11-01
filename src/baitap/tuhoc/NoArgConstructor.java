package baitap.tuhoc;

public class NoArgConstructor {
    int i;

    private NoArgConstructor(){
        
        i = 10;
        System.out.println("Đối tượng được tạo và i = " + i);
    }

    public static void main(String[] args){

        NoArgConstructor obj = new NoArgConstructor(); //Tạo đối tượng
    }
    
}
