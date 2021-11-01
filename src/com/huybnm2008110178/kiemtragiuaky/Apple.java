package com.huybnm2008110178.kiemtragiuaky;

public class Apple {

    public int id;

    public double khoiLuong;
    
    public String mauSac;

    public Apple(){};

    public Apple(int ma, double weight, String color){
        id = ma;
        khoiLuong = weight;
        mauSac = color;
        
    }
    public void inThongTin(){
        System.out.println("ID: " + id + " khối lượng: " + khoiLuong + " Màu: " + mauSac);

    }

    
    }

    

