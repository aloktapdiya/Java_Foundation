package override.overrid.application;


import override.overrid.model.Car;
import override.overrid.model.Vehicle;
import override.overrid.util.Multiplier;

public class Application {

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.multiply(10, 10));
        System.out.println(multiplier.multiply(10, 10, 10));
        System.out.println(multiplier.multiply(10, 10.5));
        System.out.println(multiplier.multiply(10.5, 10.5));

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.accelerate(100));
        System.out.println(vehicle.run());
        System.out.println(vehicle.stop());

        Vehicle car = new Car();
        System.out.println(car.accelerate(80));
        System.out.println(car.run());
        System.out.println(car.stop());
    }
}
