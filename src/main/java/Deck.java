import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;
    private Card card;



    public Deck() {
        this.deck = new ArrayList<Card>();
        this.card = new Card(SuitType.HEARTS, RankType.QUEEN);


    }

    public int countCards(){
        return deck.size();
    }

    public void addCard(Card card){
        deck.add(card);

    }

    public void addAllCards(){
        for(SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                deck.add(card);
                System.out.println(card.getRank().toString() + card.getSuit().toString());
            }
        }
    }

    public void shuffleCards(){
    Collections.shuffle(deck);
    }

    public void dealCard(){
        deck.remove(0);
    }


}



