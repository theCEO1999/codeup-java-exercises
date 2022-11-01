import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class FileIoPractice {
//    public static void main(String[] args) {
//
//        Path p = Paths.get("FileIo", "people.txt");
//        System.out.println(p);
//        System.out.println(p.toAbsolutePath());
//        List<String> lines = new ArrayList<>();
//
//
//        try {
//            lines = Files.readAllLines(p);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(lines);
//
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }
////
////
////
//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }
//
//
//
//        // ============================ WRITING FILES
////
//        Path p = Paths.get("src", "weywot", "java", "test.txt");
////
//        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
//        try {
//            Files.write(p, newNames);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
////
////
//    }
//}



