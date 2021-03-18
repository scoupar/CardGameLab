import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void checkDeckStartsEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void checkCardCanBeAdded(){
        deck.addCard(card);
        assertEquals(1, deck.countCards());
    }

    @Test
    public void checkDeckCanBePopulated(){
        deck.addAllCards();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void checkDeckShuffled(){
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        deck1.addAllCards();
        deck2.addAllCards();
        deck1.shuffleCards();
        assertNotEquals(deck1, deck2);
    }

    @Test
    public void checkCardDealt(){
        deck.addAllCards();
        deck.shuffleCards();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }
}
