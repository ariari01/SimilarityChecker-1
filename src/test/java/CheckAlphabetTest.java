import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("같은 사이즈")
    void sameLength() {
        String word1 = "ASD";
        String word2 = "DSA";

        int expected = 60;
        int result = checkAlphabet.lengthCheck(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("두 배 이상 사이즈")
    void doubleLegnth() {
        String word1 = "BBB";
        String word2 = "A";

        int expected = 0;
        int result = checkAlphabet.lengthCheck(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("부분점수")
    void partialScore() {
        String word1 = "AAABB";
        String word2 = "BAA";

        int expected = 20;
        int result = checkAlphabet.lengthCheck(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("부분점수2")
    void partialScore2() {
        String word1 = "AA";
        String word2 = "AAE";

        int expected = 30;
        int result = checkAlphabet.lengthCheck(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("부분점수3")
    void partialScore3() {
        String word1 = "jsnvoneifc";
        String word2 = "aasqcja";

        int expected = 34;
        int result = checkAlphabet.lengthCheck(word1, word2);

        assertEquals(expected, result);
    }
}
