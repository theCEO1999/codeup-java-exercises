import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {
        Person bob = new Person("bob");
        Person joe = new Person("joe");
        Person billy = new Person("billy");
        Person[] persons = new Person[] {bob, joe, billy};
        System.out.println(Arrays.toString(persons));
        for (int i = 0; i < persons.length; i++){
            System.out.printf("%s%n", persons[i].getName());
        }
        Person[] expandedArray = addPerson(persons, new Person("billy"));
        for (Person person : expandedArray){
            System.out.println(person.getName());
        }
        System.out.println(expandedArray[2]);
        System.out.println(expandedArray[3]);
        System.out.println(Arrays.toString(expandedArray));


    }

    public static Person[] addPerson(Person[] persons, Person person){
        Person[] newPersonsArray = new Person[persons.length + 1];
        for (int i = 0; i < persons.length; i++){
            newPersonsArray[i] = persons[i];
        }
        newPersonsArray[newPersonsArray.length -1] = person;
        return newPersonsArray;
    }
}
