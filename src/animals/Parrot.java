package animals;

public final class Parrot extends Bird implements Pet{


    public void beCute() {
        System.out.println("I'm cute, right, Awwwww");
    }

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Im a parrot bitch. Polly want a cracker");
    }
    public void echo(String input){
        System.out.println(input);
    }
    public Parrot(){
        System.out.println("A new Parrot has been constructed");
    }

}
