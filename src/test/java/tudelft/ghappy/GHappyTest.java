package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    //asertTrue and assertFalse
    @Test
    void testAllHappy() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("xxggxx"));
    }

    @Test
    void testSingleG() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxgxx"));
    }
    @Test
    void testSeveralGs() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }
}
