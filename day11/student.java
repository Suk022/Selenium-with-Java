package day11;

public class student {
    int sid;
    String sname;
    char sgrad;

    void displayInfo(){
        System.out.println("Student's Name `"+sid+"`, Student's Name: `"+sname+"`, Student's Grade: `"+sgrad+"`");
    }

   /*  void setStudentData(int id, String name, char grad){
        sid = id;
        sname = name;
        sgrad = grad;
    } */

    student(int id, String name, char grad){
        sid = id;
        sname = name;
        sgrad = grad;
    }
}
