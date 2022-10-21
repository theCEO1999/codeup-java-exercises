package Vehicles;

public class Car extends Vehicle{

    public void makeNoise() {
        System.out.println("SKRRRRRTTTT");
    }
    public Car(){

    }
    public Car(String name){
        this.setName(name);
    }
}
