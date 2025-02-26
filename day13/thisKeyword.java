package day13;

public class thisKeyword {
    String x,y;

    /*thisKeyword(int x, int y){
        this.x = x;
        this.y =y;
    }*/

    void setData(String x, String y){
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println("What's your last wish ... "+x+" "+y);
    }

    public static void main(String[] args) {
        thisKeyword tk = new thisKeyword();
        tk.setData("Suhkiro","The Conqui");
        tk.display();
    }
    
}
