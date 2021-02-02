package Arrays;

public class Main {
    public static void main(String[] args) {
        DeckOfCards deckOfCards=new DeckOfCards();
        deckOfCards.Shuffle();

        for (int i=0;i<52;i++){
            System.out.printf("%19s",deckOfCards.dealCard());

            if (i%4==0)
                System.out.println();
        }
    }
}
