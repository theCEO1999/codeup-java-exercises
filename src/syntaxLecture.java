public class syntaxLecture {
    public static void main(String[] args) {
        // Declare variable without initializing
        int weight;
        String breed;
        // Initializing after declaration
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
        // Initialize and declare at the same time
        String name = "Grinch";
        int cutenessFactor = 10;
        // Statement: "JVM, do something"
        System.out.println(name + " is a " + breed + ".");
        // Conditional logic
        if (cutenessFactor > 8){
            System.out.println(name + " is cute.");
        } else {
            System.out.println(name + " needs to work on cuteness.");
        }
        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber; // bytes go from -128 to 127
        short mediumNumber; // shorts go from -32768 to 32767
        int number; // integers go from -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        number = 200000000;
        smallNumber = (byte) number;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        bigNumber = 9000000000000L;

        float imafloat = 2.34F;
        double imadouble = 9.01234567890123;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);

        // java syntax types and variables exercise

        int myFavouriteNumber = 8854;
        System.out.println(myFavouriteNumber);
        double myString = 3.14159876734;
        float myNumber = 3.14F;
//        char newString = 's';
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++); // prints x then executes
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *= x; // shorthand version / also known as compound assignment operator
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
////        x = x / y;
////        y = y - x;
//        y -= (x / y);
//        System.out.println(y);
//        System.out.println(x);

        int maximumInteger = Integer.MAX_VALUE;
        System.out.println(maximumInteger);



    }
}
