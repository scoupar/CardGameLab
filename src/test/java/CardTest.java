import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void canGetSuitRankAndValue(){
        assertEquals(SuitType.SPADES, card.getSuit());
        assertEquals(RankType.ACE, card.getRank());
        assertEquals(10, card.getValueFromEnum());
    }

}
