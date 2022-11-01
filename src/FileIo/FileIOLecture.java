package FileIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
//=============================== FILE IO MINI-EXERCISE

//private static void deleteName(String nametoDelete){
//    List <String> updatedNames = new ArrayList<>();
//    for (String name : readLines()) {
//        if (!name.equalsIgnoreCase(nametoDelete)){
//            updatedNames.add(name);
//        }
//    }
//    writeLines(updatedNames);
//}

    public static void main(String[] args) {
        Path p = Paths.get( "src","FileIo", "people.txt");

        List<String> names = new ArrayList<>();

        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String name : names) {
            System.out.println(name + " works at Codeup.");
        }

        List<String> newNames = Arrays.asList("Natasha", "Jonny", "Stephanie", "Blake");
        try {
            Files.write(p, newNames);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        deleteName("Natasha");

//- BONUS: create a static method, `deleteEntry`, that takes in the name of someone (a string) and when invoked, rewrites a new list to the `people.txt` file
//  with all entries except the passed in name


    }
}