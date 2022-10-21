package animals;

public class Quote {
    public static double RandomQuote(){
        return (int) Math.ceil(Math.random() * 4);
    }
    public static String Quotes(){
        double QuoteNum = RandomQuote();
        if (QuoteNum == 1){
            return "gimme my food now or ill bite you grr";
        } else if (QuoteNum == 2){
            return "I need to shit woof woof";
        } else if (QuoteNum == 3){
            return "I want a treat *lick*";
        } else if (QuoteNum == 4){
            return "Throw the ball *begs*";
        } else {
            return "It is broken";
        }

    }
}
