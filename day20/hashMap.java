package day20;

import java.util.HashMap;
import java.util.Iterator;

public class hashMap {
    public static void main(String[] args) {
        
        //decleration

        //HashMap map = new HashMap();  if contains different data types
        HashMap<Integer, String> hm = new HashMap();

        //adding pairs

        hm.put(101, "John");
        hm.put(102, "Scott");
        hm.put(103, "mary");
        hm.put(104, "scott");
        hm.put(102, "david");

        System.out.println(hm);

        //size of hashmap

        System.out.println("Size of hashmap: "+hm.size());

        //remove pair
        hm.remove(103)  //103 is key of the pair
        System.out.println("After removing: "+ hm);

        //access value of the key
        System.out.println(hm.get(102));

        //get all the keys from hashmap
        System.out.println(hm.keySet());//only keys
        System.out.println(hm.values());//only values
        System.out.println(hm.entrySet()); //return key along with values

        //Reading data from hashmap

        //using for each 

        /*for (int k : hm.keySet())
        {
            System.out.println(k+"     "+hm.get(k));
        }
        */

        //using iterator
        Iterator<Entry<Integer, String>>  it = hm.entrySet().iterator();
        while (it.hasNext()) 
        {
            Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey()+"   "entry.getValue());    
        }

        //clear hashmap
        hm.clear();
        System.out.println("Is empty?" +hm.isEmpty());
    }
}
