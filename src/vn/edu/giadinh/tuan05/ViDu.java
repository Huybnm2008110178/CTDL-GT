package vn.edu.giadinh.tuan05;

public class ViDu {
    public static void main (String[] args){
        int []arr = {3,5,7,9};

        int newElement = 8;

        int n = arr.length;
        int [] newArr = new int[n + 1];

        for(int i = 0; i < n; i++){
            newArr[i] = arr[i];

        }

        System.out.println("In mảng cũ ");
        for(int x : arr){
            System.out.println(x);
        }

        newArr[n] = newElement;
        System.out.println("In mảng mới ");
        for(int x: newArr){
            System.out.println(x);
        }
    }
    
}
