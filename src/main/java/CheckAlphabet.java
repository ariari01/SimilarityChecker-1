public class CheckAlphabet {

    public static final int LENGTH_MATCH_MAX_POINT = 60;
    public static final int DOUBLE_SIZE_ZERO_POINT = 0;

    public void validCheck(String word1, String word2) {
        if (word1 == null || word2 == null) {
            throw new  IllegalArgumentException();
        }
    }

    public int lengthCheck(String word1, String word2) {
        if (isMatched(word1, word2)) {
            return LENGTH_MATCH_MAX_POINT;
        } else if (isDoubleSize(word1, word2)) {
            return DOUBLE_SIZE_ZERO_POINT;
        } else {
            int gab;
            int shortLength;
            if (word1.length() > word2.length()) {
                gab = word1.length() - word2.length();
                shortLength = word2.length();
            } else {
                gab = word2.length() - word1.length();
                shortLength = word1.length();
            }
            double ratio = (double) gab / shortLength;
            double temp = (1 - ratio) * 60;
            return (int)temp;
        }
    }

    private boolean isDoubleSize(String word1, String word2) {
        return (word1.length() >= (word2.length() * 2)) || (word2.length() >= (word1.length() * 2));
    }

    private boolean isMatched(String word1, String word2) {
        return word1.length() == word2.length();
    }
}
