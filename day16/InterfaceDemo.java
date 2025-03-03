package day16;

interface shape{
    int l = 20; //Final var
    int b = 30; //Final var

    void circle(); //Asbtract method, mandotory to implemnt inherited abstarct method

    default void rectangle(){
        System.out.println("This is default rectangle method");
    }

    static void square(){
        System.out.println("This is static square method");
    }

}

public class InterfaceDemo implements shape{

    public void circle(){
        System.out.println("This is circle method implmented through class");
    }

    void triangle(){
        System.out.println("This is triangle method");
    }
    
    public static void main(String[] args) {

        //Scenario 1
        /*InterfaceDemo ifobj = new InterfaceDemo();
        ifobj.circle();
        ifobj.rectangle();
        shape.square();  //Static method can be directly accessed through interface
        ifobj.triangle();
         */


        //Scenario 2 
        shape sh = new InterfaceDemo();
        sh.circle();
        sh.rectangle();
        shape.square();
        // sh.triangle(); Cant access, as triangle isnt declared in interface 
        
    }

}
