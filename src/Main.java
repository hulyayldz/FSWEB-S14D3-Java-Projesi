import Company.Car;
import Company.Ford;
import Company.Holden;
import Company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        printStartEngine(car);

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        printStartEngine(mitsubishi);

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        printStartEngine(ford);

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        printStartEngine(holden);

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());
    }

    private static void printStartEngine(Car car) {
        System.out.println(car.startEngine());
    }
}
