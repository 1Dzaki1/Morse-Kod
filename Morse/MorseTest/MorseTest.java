package Morse.MorseTest;

import Morse.MorseKodAndring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MorseTest {

    @Test
    void testMorseTillEngelska() {
        assertEquals("HEJ", MorseKodAndring.morseTillEngelska("**** * *---"));
    }

    @Test
    void testEngelskaTillMorse() {
        assertEquals("**** * *---", MorseKodAndring.engelskaTillMorse("HEJ"));
    }

    @Test
    void testMorseTomInput() {
        assertEquals("", MorseKodAndring.morseTillEngelska(""));
    }
}



