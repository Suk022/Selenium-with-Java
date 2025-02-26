package day12;

public class cnstrOvld {
    double height, widhth, depth;

    cnstrOvld(){
        height= 0;
        widhth =0;
        depth = 0;
    }

    cnstrOvld(double h, double w, double d){
        height =h;
        widhth =w;
        depth = d;
    }

    cnstrOvld(double len){
        height = widhth =depth = len;
    }

    void volume(){
        System.out.println("Volume is: "+height*depth*widhth);
    }

}
