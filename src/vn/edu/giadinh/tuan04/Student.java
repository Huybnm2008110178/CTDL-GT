package vn.edu.giadinh.tuan04;

public class Student {
    
    String name;
    int age;

    Student(){};

    Student(String n, int a){
        name = n;
        age = a;
    }
    
    void inThongTin(){
        System.out.println(" Name: " + name + " Age: " + age);
    }
}
