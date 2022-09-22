class AnyVehicle1{
    public AnyVehicle1(){
        System.out.println("Constructor of AnyVehicle1");
    }
}

class Bike1 extends AnyVehicle1{

    public Bike1(){
        System.out.println("Constructor of Bike1");
    }
}

public class ConstructorCalling {
    public static void main(String[] args) {
        Bike1 b = new Bike1();
    }
}
