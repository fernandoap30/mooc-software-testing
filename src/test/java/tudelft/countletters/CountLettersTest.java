package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {
    //test actividades
    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    //test ejercicios
    @Test
    public void TestWithX() {
        int words = new CountLetters().count("catx|dox");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void TestWithR() {
        int words = new CountLetters().count("catxr|doxr");
        Assertions.assertEquals(1, words);
    }

}