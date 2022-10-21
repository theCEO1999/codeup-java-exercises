package Vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle[] garageVehicles = new Vehicle[4];
//        garage.setVehicles(new Vehicle[4]);
        Car dailyCommuter = new Car("Audi RS7");
        Car truck = new Car("6X6 G-Wagon Truck");
        Car muscleCar = new Car("Datsun 500");
        Car luxuryCar = new Car("Bentley Continental GT");
        garageVehicles[0] = dailyCommuter;
        garageVehicles[1] = truck;
        garageVehicles[2] = muscleCar;
        garageVehicles[3] = luxuryCar;
        garage.setVehicles(garageVehicles);
        garage.alarmCascade();

    }
}
