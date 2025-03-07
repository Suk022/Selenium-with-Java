package day19;

// A B = (C)D

public class objectIII {
    public static void main(String[] args) {
        
        /* 
        Object O =new String("welcome");
        StringBuffer sb = (StringBuffer)O; //rule1-yes rule2-yes rule3-failed
        */

        /* 
        String S = new String("Welcome");
        StringBuffer sb = (StringBuffer)S; //rule1-failed
        */
        
        /*
        object O = new String("welcome");
        StringBuffer sb = (String)O; //rule1-yes rule2-failed
         */

         /*
        String S= new String("Welcpme");
        StringBuffer sb = (String)S; //rule1-yes rule2-failed
          */

        /*
        Object O = new String("Welcome");
        StringBuffer sb = (StringBuffer)O; //rule1-yes rule2-yes rule3-failed
        */

        /*
        Object O = new String("Welcome");
        String s = (String)O; //rule1-passed rule2-passed rule3-passed
         */
    }
}
