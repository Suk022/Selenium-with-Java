package day10;

public class employeeMAIN {
    public static void main(String[] args) {
        employeeCLASS emp1 = new employeeCLASS();
        emp1.empId = 1;
        emp1.empName ="Ramesh";
        emp1.job = "Do Nothing Boss";
        emp1.sal = 00000;

        emp1.display();

        employeeCLASS emp2 = new employeeCLASS();
        emp2.empId = 2;
        emp2.empName ="Suresh";
        emp2.job = "Do Nothing Vice Boss";
        emp2.sal = 00001;

        emp2.display();



    }
}
