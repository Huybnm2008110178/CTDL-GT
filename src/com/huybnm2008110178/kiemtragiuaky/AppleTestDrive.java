package com.huybnm2008110178.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Apple> appleList = new ArrayList<Apple>();
    public static void main(String[] args){
        while(true){
            System.out.println("----------Menu---------");
            System.out.println("1. Nhập táo ");
            System.out.println("2. Tìm táo theo màu ");
            System.out.println("3. Nhập danh sách táo ");
            System.out.println("4. Kết thúc ");
            System.out.println("------------------------");
            System.out.println("Chọn chức năng ");
            int luaChon = scanner.nextInt();

            switch(luaChon){
                case 1: nhap();
                      break;
                case 2: tim();
                      break;
                case 3: inDanhSach();
                      break;
                default: System.out.println("Kết thúc");
                      break;
            }
        }          

        }

            static void nhap(){
                scanner.nextLine();
                while(true){
                    scanner.nextLine();
                    Apple apple = new Apple();
                    System.out.println("Nhập mã táo: ");
                    apple.id = scanner.nextInt();

                    System.out.println("Nhập khối lượng: ");
                    apple.khoiLuong = scanner.nextDouble();

                    System.out.println("Nhập màu táo: ");
                    apple.mauSac = scanner.nextLine();

                    appleList.add(apple);
                    System.out.println("Nhập thêm (yes/no)?:");
                    if(scanner.nextLine().equals("no"));

                    break;  

                }
            }


            static void tim(){
                System.out.println("Nhập màu muốn tìm: ");
                
                for(Apple apple : appleList){
                    if(scanner.nextLine().equals(apple.mauSac))apple.inThongTin();
                }
                

            }

            static void inDanhSach(){
                scanner.nextLine();
                for(Apple apple : appleList){
                    apple.inThongTin();
                }

            }
 }
    

    
