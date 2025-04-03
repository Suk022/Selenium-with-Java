package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet{
    public static void main(String[] args) {
        //decleration

        HashSet myset = new HashSet();
        //set myset = new HashSet();
        //HashSet <String> myset = new HashSet<String>(); 

        //adding element into hashset

        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(true);
        myset.add('A');
        myset.add(100);
        myset.add(null);
        myset.add(null);

        //printing hashset
        System.out.println(myset);

        //size of hashset 
       System.out.println("Size of hashset "+myset.size()); 

        //removing element
        myset.remove(10.5);
        System.out.println("Removing element: "+myset);
        
        //Access specicif element - not possioe
        //Inserting element - Not possible

        //convert HashSet -> ArrayList
        ArrayList al = new ArrayList(myset);
        System.out.println(al);
        System.out.println(al.get(2));


        //Read all the elements using for each
        /*for (Object x : myset){
            System.out.println(x);
        }
        */

        Iterator<Object> it = myset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //clear all the elements in hashset

        myset.clear();

        System.out.println(myset.isEmpty());

    }
    
}
