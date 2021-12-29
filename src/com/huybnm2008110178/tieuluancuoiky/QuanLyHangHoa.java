package com.huybnm2008110178.tieuluancuoiky;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;



public class QuanLyHangHoa {
    public static void main(String[] args) throws ParseException{
        ArrayList<HangHoa> listHangHoa = new ArrayList<HangHoa>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        AddRecord(listHangHoa);
        int luaChon;
        while(true){
            Menu();
            luaChon = IntInput("lựa chọn");
            if (luaChon == 1){
                System.out.println("Nhập loại hàng hóa: ");
                String type;
                while(true){
                    System.out.println("1/ thực phẩm ");
                    System.out.println("2/ sành sứ ");
                    System.out.println("3/ điện máy ");
                    int typeLuaChon = IntInput("loại lựa chọn");
                    if(typeLuaChon == 1){
                        type = "thực phẩm";
                        break;
                    }else if(typeLuaChon == 2){
                        type = "sành sứ";
                        break;
                    }else if(typeLuaChon == 3){
                        type = "điện máy";
                        break;
                    }else{
                        System.out.println("lựa chọn không phù hợp xin mời nhập lại");
                        continue;
                    }
                }
                String name = StringInput("tên hàng hóa");
                int gia = IntInput("giá tiền");
                int soLuong = IntInput("số lượng");
                String date = DateInput("Ngày nhập");
                HangHoa new1 = new HangHoa(type, name, gia, soLuong, date);
                listHangHoa.add(new1);
                System.out.println("Đã thêm hàng hóa");
            }
            else if(luaChon == 2){
                System.out.println("-----------------Sửa-----------------");
                int id = IntInput("id của hàng hóa");
                for (HangHoa i : listHangHoa){
                    if(i.hangHoaID == id){
                        XuatThongTinHangHoa(i);
                        System.out.println("Nhập loại hàng mới");
                        String newType;
                        while(true){
                            System.out.println("1/ Thực phẩm");
                            System.out.println("2/ Sành sứ");
                            System.out.println("3/ Điện máy");
                            int typeLuaChon = IntInput("loại lựa chọn");
                            if(typeLuaChon == 1){
                                newType = "Thực phẩm";
                                break;
                            }else if(typeLuaChon == 2){
                                newType = "Sành sứ";
                                break;
                            }else if(typeLuaChon == 3){
                                newType = "Điện máy";
                                break;
                            }else{
                                System.out.println("Lựa chọn không phù hợp xin mời nhập lại");
                                continue;
                            }
                        }
                        String newName = StringInput("Nhập tên hàng mới");
                        int newGia = IntInput("giá mới");
                        int newSoLuong = IntInput("số lượng mới");
                        String newDate = DateInput("ngày nhập mới");
                        i.setName(newName);
                        i.setType(newType);
                        i.setSoLuong(newSoLuong);
                        i.setGia(newGia);
                        i.setDate(newDate);
                        System.out.println("Đã sửa thành công!!");
                        break;
                    }else if(listHangHoa.indexOf(i) < listHangHoa.size()){
                        continue;
                    }else {
                        System.out.println("Không tìm thấy hàng hóa xin mời nhập lại");
                    }
                        
                }
            }
            else if(luaChon == 3){
                System.out.println("-------------------Xóa-----------------");
                int id = IntInput("id hàng hóa");
                int index;
                for(HangHoa i : listHangHoa){
                    if(i.hangHoaID == id){
                        index = listHangHoa.indexOf(i);
                        listHangHoa.remove(index);
                        System.out.println("Đã xóa thành công!!");
                        break;
                    }
                }
            }
            else if(luaChon == 4){
                while(true){
                    System.out.println("--------------------Tìm kiếm-------------------");
                    System.out.println("1/ Tìm theo loại hàng hóa");
                    System.out.println("2/ Tìm theo giá hàng hóa");
                    System.out.println("3/ Tìm theo ngày nhập");
                    System.out.println("4/ Trở lại Menu");
                    int searchLuaChon = IntInput("lựa chọn");
                    if(searchLuaChon == 1){
                        System.out.println("Nhập loại hàng cần tìm: ");
                        String searchType;
                        while(true){
                            System.out.println("1/ Thực phẩm");
                            System.out.println("2/ Sành sứ");
                            System.out.println("3/ Điện máy");
                            int typeLuaChon = IntInput("loại lựa chọn");
                            if(typeLuaChon == 1){
                                searchType = "Thực phẩm";
                                break;
                            }else if(typeLuaChon == 2){
                                searchType = "Sành sứ";
                                break;
                            }else if(typeLuaChon == 3){
                                searchType = "Điện máy";
                                break;
                            }else{
                                System.out.println("Lựa chọn không phù hợp xin mời nhập lại");
                                continue;
                            }
                        }
                        for(HangHoa i : listHangHoa){
                            if(i.type == searchType){
                                XuatThongTinHangHoa(i);
                            }
                        }
                    }else if(searchLuaChon == 2){
                        int minGia = IntInput("giá thấp nhất");
                        int maxGia = IntInput("giá cao nhất");
                        for(HangHoa i : listHangHoa){
                            if(minGia <= i.gia && i.gia <= maxGia){
                                XuatThongTinHangHoa(i);
                            }
                        }
                    }else if(searchLuaChon == 3){
                        String DateStart = DateInput("Ngày bắt đầu");
                        String DateEnd = DateInput("Ngày kết thúc");
                        Date date1 = formatter.parse(DateStart);
                        Date date2 = formatter.parse(DateEnd);
                        for(HangHoa i : listHangHoa){
                            Date date = formatter.parse(i.date);
                            if(date1.before(date) == true && date2.after(date) == true){
                                XuatThongTinHangHoa(i);
                            }
                        }
                    }else if(searchLuaChon == 4){
                        break;
                    }else{
                        continue;
                    }
                }
            }
            else if(luaChon == 5){
                System.out.println("--------------Sắp xếp-----------------");
                ArrayList<HangHoa> listThucPham = new ArrayList<HangHoa>();
                ArrayList<HangHoa> listSanhSu = new ArrayList<HangHoa>();
                ArrayList<HangHoa> listDienMay = new ArrayList<HangHoa>();
                for(HangHoa i : listHangHoa){
                    if(i.type == "thực phẩm"){
                        listThucPham.add(i);
                    }else if(i.type == "sành sứ"){
                        listSanhSu.add(i);
                    }else if(i.type == "dien may"){
                        listDienMay.add(i);
                    }
                }
                HangHoa[] listThucPham2 = listThucPham.toArray(new HangHoa[listThucPham.size()]);
                HangHoa[] listSanhSu2 = listSanhSu.toArray(new HangHoa[listSanhSu.size()]);
                HangHoa[] listDienMay2 = listDienMay.toArray(new HangHoa[listDienMay.size()]);
                while(true){
                    System.out.println("1/ sắp xếp theo giá tăng");
                    System.out.println("2/ sắp xếp theo giá giảm");
                    System.out.println("3/ sắp xếp theo ngày tăng");
                    System.out.println("4/ sắp xếp theo ngày giảm");
                    System.out.println("5/ trở lại Menu");
                    int sortLuaChon = IntInput("sắp xếp theo loại");
                    if(sortLuaChon == 1){
                        SapXepGiaTang(listThucPham);
                        SapXepGiaTang(listSanhSu);
                        SapXepGiaTang(listDienMay);
                        System.out.println("-------------------Thực phẩm-----------------");
                        for(HangHoa i : listThucPham){
                            XuatThongTinHangHoa(i);
                        }
                        System.out.println("-------------------Sành sứ--------------------");
                        for(HangHoa i : listSanhSu){
                            XuatThongTinHangHoa(i);
                        }
                        System.out.println("-------------------Điện máy--------------------");
                        for(HangHoa i : listDienMay){
                            XuatThongTinHangHoa(i);
                        }
                    }else if(sortLuaChon == 2){
                        SapXepGiaGiam(listThucPham);
                        SapXepGiaGiam(listSanhSu);
                        SapXepGiaGiam(listDienMay);
                        System.out.println("--------------------Thực phẩm------------------");
                        for(HangHoa i : listThucPham){
                            XuatThongTinHangHoa(i);
                        }
                        System.out.println("--------------------Sành Sứ--------------------");
                        for(HangHoa i : listSanhSu){
                            XuatThongTinHangHoa(i);
                        }
                        System.out.println("--------------------Điện máy-------------------");
                        for(HangHoa i : listDienMay){
                            XuatThongTinHangHoa(i);
                        }
                    }else if(sortLuaChon == 3){
                        SapXepNgayTang(listThucPham2);
                        SapXepNgayTang(listSanhSu2);
                        SapXepNgayTang(listDienMay2);
                        System.out.println("-------------------Thực phẩm---------------------");
                        for(int i = 0; i < listThucPham2.length; i++){
                            XuatThongTinHangHoa(listThucPham2[i]);
                        }
                        System.out.println("-------------------Sành sứ----------------------");
                        for(int i = 0; i < listSanhSu2.length; i++){
                            XuatThongTinHangHoa(listSanhSu2[i]);
                        }
                        System.out.println("-------------------Điện máy---------------------");
                        for(int i = 0; i < listDienMay2.length; i++){
                            XuatThongTinHangHoa(listDienMay2[i]);
                        }
                    }else if(sortLuaChon == 4){
                        SapXepNgayGiam(listThucPham2);
                        SapXepNgayGiam(listSanhSu2);
                        SapXepNgayGiam(listDienMay2);
                        System.out.println("--------------------Thực phẩm--------------------");
                        for(int i = 0; i < listThucPham2.length; i++){
                            XuatThongTinHangHoa(listThucPham2[i]);
                        }
                        System.out.println("--------------------Sành sứ----------------------");
                        for(int i = 0; i < listSanhSu2.length; i++){
                            XuatThongTinHangHoa(listSanhSu2[i]);
                        }
                        System.out.println("--------------------Điện máy---------------------");
                        for(int i = 0; i < listDienMay2.length; i++){
                            XuatThongTinHangHoa(listDienMay2[i]);
                        }
                    }else if(sortLuaChon == 5){
                        break;
                    }else{
                        continue;
                    }
                }
            }
            else if(luaChon == 6){
                System.out.println("--------------------Thống kê-----------------------");
                int TongSoLuongHangHoa = 0;
                int TongGiaTriNhapHang = 0;
                int SoLuongHangThucPham = 0;
                int SoLuongHangSanhSu = 0;
                int SoLuongHangDienMay = 0;
                for(HangHoa i : listHangHoa){
                    TongSoLuongHangHoa = TongSoLuongHangHoa + i.soLuong;
                    int giaTri = i.soLuong*i.gia;
                    TongGiaTriNhapHang = TongGiaTriNhapHang + giaTri;
                    if(i.type == "thực phẩm"){
                        SoLuongHangThucPham = SoLuongHangThucPham + i.soLuong;
                    }else if(i.type == "sành sứ"){
                        SoLuongHangSanhSu = SoLuongHangSanhSu + i.soLuong;
                    }else{
                        SoLuongHangDienMay = SoLuongHangDienMay  + i.soLuong;
                    }
                }
                System.out.println("Tổng số lượng hàng: " + Integer.toString(TongSoLuongHangHoa));
                System.out.println("Tổng giá trị nhập: " + Integer.toString(TongGiaTriNhapHang));
                System.out.println("Số lượng hàng thực phẩm: " + Integer.toString(SoLuongHangThucPham));
                System.out.println("Số lượng hàng sành sứ: " + Integer.toString(SoLuongHangSanhSu));
                System.out.println("Số lượng hàng điện máy: " + Integer.toString(SoLuongHangDienMay));
                System.out.println("----------------------------------------------------");
            }
            else if(luaChon == 7){
                System.out.println("----------------------Thoát------------------------");
            }else{
                System.out.println("lựa chọn không phù hợp xin mời nhập lại");
            }
            
        }
        
    }
    static void Menu(){
        System.out.println("--------------------Chương trình quản lý hàng hóa-----------------------");
        System.out.println("1/ Thêm hàng hóa");
        System.out.println("2/ Sửa hàng hóa");
        System.out.println("3/ Xóa hàng hóa");
        System.out.println("4/ Tìm kiếm hàng hóa");
        System.out.println("5/ Sắp xếp hàng hóa");
        System.out.println("6/ Xem thống kê");
        System.out.println("7/ Thoát");
        System.out.println();
    }
    static void XuatThongTinHangHoa(HangHoa a){
        System.out.println("---------------------------");
        System.out.println("Mã hàng hóa: " + a.hangHoaID);
        System.out.println("Tên hàng hóa: " + a.getName());
        System.out.println("Loại hàng hóa: " + a.getType());
        System.out.println("Giá: " + a.getGia() + "đ");
        System.out.println("Số lượng hàng hóa: " + a.getSoLuong());
        System.out.println("Ngày nhập: " + a.getDate());
        System.out.println("---------------------------");
        System.out.println();
    }
    static int IntInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập " +title+ " : ");
        while(!scanner.hasNextInt()){
            System.out.print("Nhập sai vui lòng nhập lại " +title+ " : ");
            scanner.next();
        }
        int value = scanner.nextInt();
        return value;
    }
    static String StringInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập " +title+ " : ");
        while(!scanner.hasNextLine()){
            System.out.print("Nhập sai vui lòng nhập lại " +title+ " : ");
            scanner.next();
        }
        String value = scanner.nextLine();
        return value;
    }
    static String DateInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập " +title+ " : ");
        String dd,mm,yyyy;
        while(true){
            dd = Integer.toString(IntInput("ngày"));
            if(dd.length() == 2){
                break;
            }else{
                System.out.println("Nhập sai vui lòng nhập lại");
                continue;
            }
        }
        while(true){
            mm = Integer.toString(IntInput("tháng"));
            if(mm.length() == 2){
                break;
            }else{
                System.out.println("Nhập sai vui lòng nhập lại");
                continue;
            }
        }
        while(true){
            yyyy = Integer.toString(IntInput("năm"));
            if(yyyy.length() == 4){
                break;
            }else{
                System.out.println("Nhập sai vui lòng nhập lại");
                continue;
            }
        }
        String result = dd+"-"+mm+"-"+yyyy;
        return result; 
    }
    static void AddRecord(ArrayList<HangHoa> list){
        HangHoa new1 = new HangHoa("thực phẩm", "Rau tươi", 2000, 120, "29-12-2021");
        list.add(new1);
        HangHoa new2 = new HangHoa("thực phẩm", "Bánh snack", 6000, 150, "28-12-2021");
        list.add(new2);
        HangHoa new3 = new HangHoa("thực phẩm", "Mì gói", 4000, 200, "20-12-2021");
        list.add(new3);
        HangHoa new4 = new HangHoa("thực phẩm", "kem", 10000, 230, "25-12-2021");
        list.add(new4);
        HangHoa new5 = new HangHoa("thực phẩm", "khoai tây chiên", 20000, 300, "27-12-2021");
        list.add(new5);
        HangHoa new6 = new HangHoa("thực phẩm", "bánh mì", 15000, 240, "26-12-2021");
        list.add(new6);
        HangHoa new7 = new HangHoa("Sành sứ", "chén dĩa", 120000, 250, "28-12-2021");
        list.add(new7);
        HangHoa new8 = new HangHoa("Sành sứ", "bình hoa", 100000, 200, "20-12-2021");
        list.add(new8);
        HangHoa new9 = new HangHoa("Sành sứ", "ấm trà", 150000, 255, "26-12-2021");
        list.add(new9);
        HangHoa new10 = new HangHoa("Điện máy", "TV", 4000000, 150, "24-12-2021");
        list.add(new10);
        HangHoa new11 = new HangHoa("Điện máy", "tủ lạnh", 7000000, 167, "12-12-2021");
        list.add(new11);
        HangHoa new12 = new HangHoa("Điện máy", "máy tính", 10000000, 127, "16-12-2021");
        list.add(new12);
        HangHoa new13 = new HangHoa("Điện máy", "điện thoại", 5000000, 170, "26-12-2021");
        list.add(new13);
        HangHoa new14 = new HangHoa("Điện máy", "laptop", 11000000,190, "16-12-2021");
        list.add(new14);
        HangHoa new15 = new HangHoa("Điện máy", "lò sưởi", 2000000,160, "23-12-2021");
        list.add(new15);
        HangHoa new16 = new HangHoa("Điện máy", "quạt", 1000000, 250, "14-12-2021");
        list.add(new16);
        HangHoa new17 = new HangHoa("Điện máy", "bếp điện từ", 2000000, 420, "10-12-2021");
        list.add(new17);
        HangHoa new18 = new HangHoa("Điện máy", "bàn phím máy tính", 2000000, 120, "12-12-2021");
        list.add(new18);
        HangHoa new19 = new HangHoa("Điện máy", "chuột máy tính", 500000, 190, "21-12-2021");
        list.add(new19);
        HangHoa new20 = new HangHoa("Điện máy", "tai nghe", 200000, 160, "15-12-2021");
        list.add(new20);
    }
    static void SapXepGiaTang(ArrayList<HangHoa> list){
        Collections.sort(list, new Comparator<HangHoa>(){
            

            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                // TODO Auto-generated method stub
                return o1.gia - o2.gia;
            }
        });
    }
    static void SapXepGiaGiam(ArrayList<HangHoa> list){
        Collections.sort(list, new Comparator<HangHoa>(){

            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                // TODO Auto-generated method stub
                return o2.gia - o1.gia;
            }
            
        });
    }
    static void SapXepNgayTang(HangHoa[] list) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        HangHoa temp = list[0];
        for(int i = 0; i < list.length - 1; i++){
            for(int j = i + 1; j < list.length; j++){
                Date date1 = formatter.parse(list[i].date);
                Date date2 = formatter.parse(list[j].date);
                if(date1.after(date2) == true){
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }

        }
    }
    static void SapXepNgayGiam(HangHoa[] list) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        HangHoa temp = list[0];
        for(int i = 0; i < list.length - 1; i++){
            for(int j = i + 1; j < list.length; j++){
                Date date1 = formatter.parse(list[i].date);
                Date date2 = formatter.parse(list[j].date);
                if(date1.before(date2) == true){
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }
        


    
}
