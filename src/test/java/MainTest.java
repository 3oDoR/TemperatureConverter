import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class MainTest {

    Main main = new Main();

    @Test
    void CorrectConvertCtoF() {
        Assertions.assertEquals(73.4D, main.convertCtoF("C F", new Scanner("23")));
    }

    @Test
    void IncorrectConvertCtoF() {
        Assertions.assertEquals(0D, main.convertCtoF("C F", new Scanner("asdgb")));
    }

    @Test
    void IncorrectConvertCtoF2() {
        Assertions.assertEquals(0D, main.convertCtoF("a f", new Scanner("23")));
    }

    @Test
    void CorrectConvertCtoK() {
        Assertions.assertEquals(306.15D, main.convertCtoK("c K", new Scanner("33")));
    }

    @Test
    void IncorrectConvertCtoK() {
        Assertions.assertEquals(0D, main.convertCtoK("C K", new Scanner("asdgb")));
    }

    @Test
    void IncorrectConvertCtoK2() {
        Assertions.assertEquals(0D, main.convertCtoK("C u", new Scanner("33")));
    }

    @Test
    void CorrectConvertFtoC() {
        Assertions.assertEquals(6.666666666666667D, main.convertFtoC("F c", new Scanner("44")));
    }

    @Test
    void IncorrectConvertFtoC() {
        Assertions.assertEquals(0D, main.convertFtoC("sad", new Scanner("44")));
    }

    @Test
    void IncorrectConvertFtoC2() {
        Assertions.assertEquals(0D, main.convertFtoC("f c", new Scanner("sad")));
    }

    @Test
    void CorrectConvertFtoK() {
        Assertions.assertEquals(285.9833333333333D, main.convertFtoK("F K", new Scanner("55.1")));
    }

    @Test
    void IncorrectConvertFtoK() {
        Assertions.assertEquals(0D, main.convertFtoK("F a", new Scanner("55.1")));
    }

    @Test
    void IncorrectConvertFtoK2() {
        Assertions.assertEquals(0D, main.convertFtoK("F K", new Scanner("   ")));
    }

    @Test
    void CorrectConvertKtoC() {
        Assertions.assertEquals(-217.64999999999998D, main.convertKtoC("k c", new Scanner("55.5")));
    }

    @Test
    void IncorrectConvertKtoC() {
        Assertions.assertEquals(0D, main.convertKtoC("k q", new Scanner("55.5")));
    }

    @Test
    void IncorrectConvertKtoC2() {
        Assertions.assertEquals(0D, main.convertKtoC("k q", new Scanner("asd")));
    }

    @Test
    void CorrectConvertKtoF() {
        Assertions.assertEquals(-359.77D, main.convertKtoF("K F", new Scanner("55.5")));
    }

    @Test
    void IncorrectConvertKtoF() {
        Assertions.assertEquals(0D, main.convertKtoF("K S", new Scanner("55.5")));
    }

    @Test
    void IncorrectConvertKtoF2() {
        Assertions.assertEquals(0D, main.convertKtoF("K F", new Scanner(".")));
    }

    @Test
    void notEqualsCtoFAndFtoC() {
        Assertions.assertNotEquals(main.convertCtoF("c f", new Scanner("33")), main.convertFtoC("F C", new Scanner("33")));
    }
}
