abstract class Vehicle{
    abstract void accelerate();
    abstract void brake();

    void startEngine(){
        System.out.println("Engine Started");
    }
}

class Car extends Vehicle{
    @Override
    void accelerate(){
        System.out.println("Car: Pressing the pedal");

    }
@Override
    void brake(){
        System.out.println("Car: Applying brakes");
    }
}




public class learnabstract {
    public static void main (String agrs[]){
        Vehicle  myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();

    }
}
