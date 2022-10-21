
import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesOrNo());
//        System.out.println(input.getInteger(0, input.generateRandomNumber(1000)));
        System.out.println(input.getDouble(0, input.generateRandomNumber(1000)));
    }
}
