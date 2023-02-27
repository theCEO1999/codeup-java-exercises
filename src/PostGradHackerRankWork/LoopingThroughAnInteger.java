
package PostGradHackerRankWork;
import java.io.*;
import java.util.*;

public class LoopingThroughAnInteger {


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());

            for (int i = 1; i <= 10; i++) {
                int result = N * i;
                System.out.printf("%d x %d = %d%n", N, i, result);
            }

            bufferedReader.close();
        }

}
//In this code, we read the input integer N from the user and then use a for loop to iterate from 1 to 10.
// In each iteration, we calculate the result of N multiplied by i and store it in the result variable.
// Then, we use the System.out.printf method to print the result in the required format, where %d is a
// placeholder for an integer value, %n is a platform-independent newline character, and the order of
// the placeholders matches the order of the variables passed to the method.




