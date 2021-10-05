package vn.edu.giadinh.tuan04;

import javax.print.attribute.Size2DSyntax;

public class dog {
    
    String name;
    
    int size;

    String color;

    public dog(){}
    
    public dog(int s){
        size = s;
    }

    public dog(int s, String c, String n){
        size = s;
        color = c;
        name = n;
    }

    void inThongTin(){
        System.out.println(" Size = " + size + " " + " color = " + color + " name = " + name);
    }
}
