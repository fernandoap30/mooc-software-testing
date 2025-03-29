package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {

    @Test
    void test1() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("efg", csc.CaesarShiftCipher("abc", 4));
    }
    @Test
    void test2() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("cde cde", csc.CaesarShiftCipher("abc abc", 2));
    }

    @Test
    void test3() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("def dac", csc.CaesarShiftCipher("abc axz", 3));
    }

}
