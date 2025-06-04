import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckAlphabetTest {

    private CheckAlphabet checkAlphabet;

    @BeforeEach
    void setUp() {
        checkAlphabet = new CheckAlphabet();
    }

    @Test
    void createCheckAlphabet() {
        assertNotNull(checkAlphabet);
    }

    @Test
    void throwExcetionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
           checkAlphabet.validCheck(null, "ABC");
           checkAlphabet.validCheck("AVC", "ABC");
        });
    }

    @Test
    void sameLength() {
        String word1 = "ASD";
        String word2 = "DSA";

        int expected = 60;
        int result = checkAlphabet.lengthCheck(word1, word2);

        assertEquals(expected, result);
    }
}
