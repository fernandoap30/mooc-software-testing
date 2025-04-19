package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {
    //test actividades
    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(27, 22);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(12, 3);
        Assertions.assertEquals(12, result);
    }
    //test ejercicios
    @Test
    public void rightPlayerWins() {
        int result = new BlackJack().play(12, 13);
        Assertions.assertEquals(13, result);
    }
    @Test
    public void bothPlayerDraw() {
        int result = new BlackJack().play(11, 11);
        Assertions.assertEquals(11, result);
    }
    @Test
    public void limits21() {
        int result = new BlackJack().play(21, 19);
        Assertions.assertEquals(21, result);
    }
}
