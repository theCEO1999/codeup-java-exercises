public class PetDog extends Pet implements Companion{
    public String snuggle() {
        return getName() + " wants to snuggle";
    }

    boolean trained;

    public PetDog(boolean trained){
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public PetDog(String name, String type, boolean trained){
        super(name, type);
        this.trained = trained;
    }
}
