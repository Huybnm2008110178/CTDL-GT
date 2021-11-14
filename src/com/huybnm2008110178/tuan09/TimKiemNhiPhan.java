package com.huybnm2008110178.tuan09;

public class TimKiemNhiPhan {
    public static void main(String[] args){
        int arr[] = {2, 3, 4, 10, 40};
        System.out.println("Tìm kiếm ở phần tử: " + binarySearch(arr,5));
    
    }

    public static int binarySearch(int arr[], int x){
        int l = 0, r = arr.length - 1;
        while (l <= r){
            int m = l + (r-l)/2;

            if(arr[m] == x)
                 l = m + 1;
            else
                 r = m - 1;     
        }
        return -1;

    }

    
}
