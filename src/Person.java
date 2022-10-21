public class Person {

    String name;
    public String getName(){
        return name;
//TODO: return the person's name
    }

    public void setName(String name){
         this.name = name;
//TODO: change the name field to the passed value
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + getName() + ", I know who you are...");
    }
//    The class should have a constructor that accepts a `String` value and sets
//    the person's name to the passed string.
//
//    Create a `main` method on the class that creates a new `Person` object and
//    tests the above methods.
    public Person(){

    }
    public Person(String name){
    this.name = name;
    }

}
