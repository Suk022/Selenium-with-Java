package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList{
    public static void main(String[] args) {
        
        //decleration
        ArrayList mylist = new ArrayList();
        //List mylist =  new ArrayList();
        //ArrayList<String> mylist= new ArrayList<String>();
        
        //adding data to ArrayList
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add(true);
        mylist.add('Y');
        mylist.add(14563);
        mylist.add(null);
        mylist.add(null);
        
        //size of arrayList
        System.out.println("Size of an ArrayList is "+mylist.size());

        //data of arrayList
        System.out.println("Data in the ArrayList is "+mylist);

        //removing the data
        mylist.remove(7);
        System.out.println("After removing, Datas are "+mylist);

        //insert element
        mylist.add(2,"Added 5");
        System.out.println("After Insertion, Data are "+mylist);

        //modify element
        mylist.set(2, "Modified");
        System.out.println("Modified, Datas are "+mylist);

        //access specific element
        System.out.println(mylist.get(4));

        //read all elements

        //using normal for loop
        /*for(int i =0; i < mylist.size();i++){
            System.out.print(mylist.get(i)+" ");
        }
        */

        //using for each
        /*for(Object x : mylist){
            System.out.print(x+" ");
        }
        */

        //using iterator
        Iterator it=mylist.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");            
        }

        //checking arrayList empty or not
        System.out.println("Is ArrayList empty? "+mylist.isEmpty());

        //remove all the elements
        ArrayList mylist2 = new ArrayList();
        mylist2.add(100);
        mylist2.add("modified");
        mylist2.add(14563);

        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements, "+mylist);

        //remove all the elements/clear
        mylist.clear();
        System.out.println("Is ArrayList empty? "+mylist.isEmpty());


    }
}