package vn.edu.giadinh.tuan03;

public class Cow {

    double weight;
    String breed;//giống
    String color;//màu sắc

    //HÀM TẠO
    //developers tạo ra KHÔNG DỂ java compiler tạo ra
    
    Cow(){//HÀM TẠO MẶC ĐỊNH DO developer tạo ra 

    }

    Cow(double w){
        weight = w;
    }
    
    Cow(double i, String br, String cl){
        weight = i;
        breed = br;
        color = cl;
    }

    void InThongTin(){
        
    }
}
