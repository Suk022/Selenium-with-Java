package day12;

public class cnstrOvldMAIN {
    public static void main(String[] args) {
     cnstrOvld dim1 = new cnstrOvld();
     dim1.volume();   

     cnstrOvld dim2 = new cnstrOvld(5.3, 2.0, 5.3);
     dim2.volume();
     
     cnstrOvld dim3 =new cnstrOvld(5.3);
     dim3.volume();
    }
}
