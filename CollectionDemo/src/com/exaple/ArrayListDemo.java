package com.exaple;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {    
        // TODO Auto-generated method stub
        
        
        ArrayList<String> vegetables = new ArrayList<String>();
        
        // Adding elements to the ArrayList
        vegetables.add("Cucumber");
        vegetables.add("Pumpkin");
        vegetables.add("Tomato");
        vegetables.add("Peppers");
        vegetables.add("Eggplant");
        
        // Printing the elements in the ArrayList
        System.out.println("Favourite vegetables are: " + vegetables);
        
        
        Iterator itr = vegetables.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // Getting specified element from a specific position
        String str = vegetables.get(4);
        System.out.println("The specified vegetable is: " + str);
        
        // Modifying the list at specified position
        vegetables.set(0, "Corn");
        System.out.println("vegetables in the list are: " + vegetables); 
        
        vegetables.remove(3);
        System.out.println(vegetables);
    }
}
