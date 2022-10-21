package Vehicles;

public class Motorcycle extends Vehicle{

    public void makeNoise() {
        System.out.println("BBBBBBGGGGRRRMMMMMMM POP*POP*POP");
    }
    public void breakDown(){
        super.makeNoise();
        System.out.println("KRRrrrrrrKLLluNK");
    }
}
