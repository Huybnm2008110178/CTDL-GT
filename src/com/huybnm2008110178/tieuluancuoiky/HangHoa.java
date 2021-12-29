package com.huybnm2008110178.tieuluancuoiky;

public class HangHoa {
    private static int count = 0;
         int hangHoaID;
         int gia;
         int soLuong;
         String type;
         String name;
         String date;

         public HangHoa(String type, String name, int gia, int soLuong, String date){
         this.gia = gia;
         this.soLuong = soLuong;
         this.date = date;
         this.hangHoaID = ++count;
    }

    public String getType(){
        return type;

    }

    public void setType(String type){
        this.type = type;

    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;

    }

    public int getGia(){
        return gia;  

    }

    public void setGia(int gia){
        this.gia = gia;

    }

    public int getSoLuong(){
        return soLuong;

    }

    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;

    }

    public String getDate(){
        return date;

    }

    public void setDate(String date){
        this.date = date;
    }

    
}
