public class ServerNameGenerator {

    public static String randomGenerator(){
        String[] adjectiveArray = {"public", "personal", "false", "true", "weird", "tall", "soft", "loud", "short", "long" };
        String[] nounArray = {"time", "person", "government", "life", "world", "child", "eye", "man", "woman", "problem"};
        int random =  ((int) Math.floor(Math.random()*10));
        return adjectiveArray[random] + "-" + nounArray[random];
    }

    public static void main(String[] args) {
        String[] adjectiveArray = {"public", "personal", "false", "true", "weird", "tall", "soft", "loud", "short", "long" };
        String[] nounArray = {"time", "person", "government", "life", "world", "child", "eye", "man", "woman", "problem"};
        System.out.printf("Here is your server name: %n" + randomGenerator());
    }


}
