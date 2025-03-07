package day19;

// Upcasting -- converting value from smaller to larger. ex.int -> long
// downcasting -- converting value from larger to smaller. ex. long -> int (chances of value being truncated) 

public class TypeCasting {
    public static void main(String[] args) {
        //Upcasting
        /*
        int num = 1234;
        long longValue = num;
        System.out.println(longValue);

        float nm = 10.6f;
        double doubleValue = nm;
        System.out.println(doubleValue);
         */
        
        //Downcasting

        long num = 12345678;
        int numValue = (int)num; 
        System.out.println(numValue);

        double nm = 10834.679073;
        float floatValue = (float)nm;
        System.out.println(floatValue); //here, orginal value was truncated after downcasting


        
    }    
}
