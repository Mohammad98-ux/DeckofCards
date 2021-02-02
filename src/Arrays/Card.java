package Arrays;

public class Card {
    public String face;
    public String suit;

    //constructor
    public Card(String face,String suit){
        this.face=face;//initialize face in Card
        this.suit=suit;//initialize suit in Card
    }
    //End constructor Card

    // return String representation of Card
    public String toString(){
        return face+" of "+suit;
    }//End method toString


}//End class Card
