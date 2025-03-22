package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(4, 2, 3);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void chocolaton() {
        int result = new ChocolateBags().calculate(3,4,21);
        Assertions.assertEquals(1,result);
    }
    @Test
    public void chocolaton2() {
        int result = new ChocolateBags().calculate(5,6,22);
        Assertions.assertEquals(2,result);
    }
    @Test
    public void chocolaton3() {
        int result = new ChocolateBags().calculate(10,4,30);
        Assertions.assertEquals(10,result);
    }
}
