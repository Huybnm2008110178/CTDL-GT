package vn.edu.giadinh.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentTestDrive {
    public static void main (String[] args){
        //Tạo 1 danh sách sinh viên
        Student[] stundentList = new Student[2];

        //Nhập danh sách sinh viên từ bàn phím
        Scanner varInput = new Scanner(System.in);
        
        System.out.println("Nhập danh sách sinh viên ");

        for(int i = 0; i < stundentList.length; i++){
            System.out.println("Nhập sinh viên thứ " + (i+1));
            System.out.println("Tên sinh viên: ");
            String name = varInput.nextLine();
            System.out.print("Tuổi: ");
            int age = varInput.nextInt(); //15 ENTER
            varInput.nextLine(); //NHẬN VÀO PHÍM ENTER
            stundentList[i] = new Student(name, age);
        }

        //in danh sách sinh viên
        System.out.println("===========in danh sách sinh viên sau nhập===============");
        for (Student student : stundentList){
        
            student.inThongTin();
        }
        
        List list = Arrays.asList(stundentList);
        
        //BỘ SO SÁNH
        Comparator comparator = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
               
                return 0;
            }
        
        };
        list.sort(comparator);

        //in danh sách sinh viên
        System.out.println("===========in danh sách sinh viên sau khi so sánh===============");
        for (Student student : stundentList){
        
            student.inThongTin();
        }
    }
}
