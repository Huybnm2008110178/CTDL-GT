package vn.edu.giadinh.tuan05;

public class CTMinhHoaTuan6 {
    public static void main(String[] args){
        //int a = 5, b = 6;
         
         Integer a, b;

         a = Integer.valueOf(5);

         b = Integer.valueOf(6);

         swap(a,b);

        System.out.println(" a = " + a + " b = " + b);
    }

    static void swap(Integer a, Integer b){
        Integer temp;
        temp = a.intValue();
        a = Integer.valueOf(b);
        b = Integer.valueOf(a);

    }

}
