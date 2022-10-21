package animals;

public class Dog {
    public String name;
    public String sound;
    public String kill = "GRRRRRRR *kills* ";

    public void makeNoise(){
        System.out.printf("%s goes %s%n", name, Quote.Quotes());
    }
    public void KillMode(){
        System.out.printf("%s's hair gets spiky as she goes %s%s%n", name, kill, sound);
    }


}
