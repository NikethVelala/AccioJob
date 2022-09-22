import java.util.*;
class Minii{
    int base;
    Minii(){
        this.base = 50;
    }
    public int miniPrice(int dis){
        int total=0;
        if(dis<=3){
            total = 50;
        }
        else if(dis<=18 && dis>3){
            total = 50 + (dis-3)* 10;
        }
        else if(dis<=75 && dis>15)  {
            total = 200 + (dis-18)*8;
        }

        else{
            total=(dis)*8;
        }

        return total;
    }
}

class Sedan{
    int base;
    Sedan(){
        this.base = 80;
    }

    int total =0;
    public int sedanPrice(int dis){
        if(dis<=5){
            total = 80;
        }
        else if(dis<=20 && dis>5){
            total = 80 + (dis-5)* 12;
        }
        else if(dis<=100 && dis>20){
            total = 260 + (dis-20)*10;
        }

        else{
            total=dis*10;
        }

        return total;

    }
}

class SUV{
    int base;
    SUV(){
        this.base = 100;
    }
    int total=0;
    public int SUVPrice(int dis){
        if(dis<=5){
            total = 100;
        }

        if(dis<=20 && dis>5){
            total = 100 + (dis-5)*15;
        }

        if(dis>20){
            total = (dis-20)*12 + 325;
        }

        return total;
    }


}
public class Apali{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        Minii m = new Minii();
        Sedan sed = new Sedan();
        SUV suv = new SUV();
        System.out.println("Mini: "+m.miniPrice(dis));
        System.out.println("Sedan: "+sed.sedanPrice(dis));
        System.out.println("SUV: "+suv.SUVPrice(dis));


    }
}