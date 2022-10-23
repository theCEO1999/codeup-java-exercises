package Vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
//        garage.setVehicles(new Vehicle[4]);
        Car dailyCommuter = new Car("Audi RS7");
        Car truck = new Car("6X6 G-Wagon Truck");
        Car muscleCar = new Car("Datsun 500");
        Car luxuryCar = new Car("Bentley Continental GT");
        Vehicle[] garageVehicles = {dailyCommuter, truck, muscleCar, luxuryCar};
        garage.setVehicles(garageVehicles);
        garage.alarmCascade();
        garage.getVehicles()[1] = new Motorcycle("Ducatti");
        System.out.println(garage.getVehicles()[1].getName());

    }
}
