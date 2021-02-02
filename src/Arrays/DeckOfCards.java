package Arrays;

import java.util.Random;

public class DeckOfCards {
    private Card[]data;
    private int curruntCard;
    private static final int numberofcard=52;

    private static final Random random=new Random();

    public DeckOfCards(){
        String []Faces={"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String []Suits={"Hearts", "Diamonds", "Clubs", "Spades"};

        data=new Card[numberofcard];
        curruntCard=0;

        for (int count=0;count<data.length;count++){
            data[count]=new Card(Faces[ count%13 ],Suits[ count/13 ]);
        }
    }

    public void Shuffle(){
        curruntCard=0;
        for (int first=0;first<data.length;first++){
            int second=random.nextInt(numberofcard);
            Card temp=data[first];
            data[first]=data[second];
            data[second]=temp;
        }
    }

    public Card dealCard(){
        if (curruntCard<data.length)
            return data[curruntCard++];
        else
            return null;
    }
}
