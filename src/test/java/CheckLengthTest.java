import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CheckLengthTest {

    @Test
    void create() {
        CheckLength checkLenth = new CheckLength();
        assertNotNull(checkLenth);
    }
}
