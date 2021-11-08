package vn.edu.giadinh.tuan10;

import java.util.ArrayList;

public class AppleInventory {

    ArrayList<Apple> inventory = new ArrayList<>();

    public AppleInventory(){

    }

    public void them(Apple apple){

        inventory.add(apple);
    }

    public void inAppleList(){
        for (Apple apple : inventory){
            apple.printApple();
        }
    }

    public ArrayList<Apple> findAppleByColor(String color){
        ArrayList<Apple> results = new ArrayList<>();

        for(Apple apple : results){
            if(apple.color.equalsIgnoreCase(color)){
                results.add(apple);
            }
        }

        return results;
    }
    
}
