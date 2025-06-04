import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
//
//    @Test
//    void sameLength() {
//        String input1 = "ASD";
//        String input2 = "DSA";
//
//
//
//    }
}
