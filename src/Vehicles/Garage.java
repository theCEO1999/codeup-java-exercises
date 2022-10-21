package Vehicles;

public class Garage {
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    private Vehicle[] vehicles;

    public void alarmCascade(){
        for(Vehicle vehicle : vehicles){
            vehicle.alarm();
        }
    }

}
