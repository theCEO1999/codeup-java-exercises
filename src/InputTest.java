
import util.Input;
import util.InputMoreBetter;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesOrNo());
//        System.out.println(input.getInteger(0, input.generateRandomNumber(1000)));
//        System.out.println(input.getDouble(0, input.generateRandomNumber(1000)));
//        System.out.println(input.getInt(6));
        InputMoreBetter inputBetter = new InputMoreBetter();
//        System.out.println("Enter a number!");
//        int num = inputBetter.getInt();
//        System.out.println(num);
        System.out.println("Enter a double!");
        Double num2 = inputBetter.getDouble();
        System.out.println(num2);
    }
}
