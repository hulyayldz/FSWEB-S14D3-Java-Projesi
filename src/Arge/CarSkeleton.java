package Arge;

public class CarSkeleton {
    private String name;
    private String description;


    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return getName() + "starting engine.";
    }

    public String drive() {
        runEngine(this);
        return getName()+ "is driving...";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.getClass().getSimpleName());
        if(carSkeleton instanceof ElectricCar) {
            double kmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            double batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The car is starting with electric.Per charge: "+kmPerCharge+ "battery size: " + batterySize);
        }
        else if(carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = ((HybridCar)carSkeleton);
            System.out.println("The car is starting with hybrid.Per charge: "+hybridCar.getAvgKmPerLitre()+ "battery size: " + hybridCar.getBatterySize()+"cylinder" + hybridCar.getCylinders());


        }
        else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = ((GasPoweredCar)carSkeleton);
            System.out.println("The car is starting with gasPoweredCar.Per charge: "+gasPoweredCar.getAvgKmPerLitre()+ gasPoweredCar.getCylinders());
        }
        else {
            System.out.println("invalid car type!");
        }


    }
}
