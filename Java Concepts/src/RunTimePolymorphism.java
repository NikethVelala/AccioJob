class AnyVehicle{
    public void move(){
        System.out.println("Any vehicle should move");
    }
}

class Bike extends AnyVehicle{

    //method overriding  :  runtime polymorphism
    public void move(){
        System.out.println("Bike can move too!!");
    }
}


public class RunTimePolymorphism {
    public static void main(String[] args) {
        AnyVehicle vehicle = new Bike();
        // Decided on the runtime  :  Run Time Polymorphism
        vehicle.move();

        vehicle = new AnyVehicle();
        // Also decided on the runtime
        vehicle.move();
    }
}
