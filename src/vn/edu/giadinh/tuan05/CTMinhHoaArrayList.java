                                                                                                                                                                                           package vn.edu.giadinh.tuan05;

import java.util.ArrayList;
import java.util.List;

import vn.edu.giadinh.tuan04.Student;
import vn.edu.giadinh.tuan04.dog;

public class CTMinhHoaArrayList {
    public static void main(String[] args){
         
        ArrayList a = new ArrayList();
        a.add("Cường");
        a.add(1);
        a.add(new dog(22, "Vàng", "Fido"));

        dog dog = (dog) a.get(2);
        System.out.println("Dog name: "+ dog.name + " color " + dog.color);

        a.add(1.5);
       
        System.out.println(a.get(0));



        List bienTCArrayList = new ArrayList();

        bienTCArrayList.add(new Student("Tèo", 18));
        
        //Lấy 1 phần tử từ list
        Student student = (Student) bienTCArrayList.get(0);

        System.out.println(bienTCArrayList);

        List<String> lisStrings = new ArrayList<>();
        //lisStrings.add(1);
        lisStrings.add("Mr Tèo");

        ArrayList<Student> aStudents = new ArrayList<>();
        //aStudents.add("Mr Tèo");
        Student student2 = new Student();
        aStudents.add(student);
        aStudents.add(new Student());

    }
    
}
