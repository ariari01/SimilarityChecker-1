public class CheckAlphabet {
    public static final int LENGTH_MATCH_MAX_POINT = 60;
    public static final int DOUBLE_SIZE_ZERO_POINT = 0;

    public void validCheck(String word1, String word2) {
        if (word1 == null || word2 == null) {
            throw new IllegalArgumentException();
        }

        if (word1.isEmpty() || word2.isEmpty()) {
            throw new IllegalArgumentException();
        }

        updateBigChar result = getUpdateBigChar(word1, word2);

        for (char ch : result.word1().toCharArray()) {
            if  (ch < 'A' || ch > 'Z') {
                throw new  IllegalArgumentException();
            }
        }

        for (char ch : result.word2().toCharArray()) {
            if  (ch < 'A' || ch > 'Z') {
                throw new  IllegalArgumentException();
            }
        }
    }

    private updateBigChar getUpdateBigChar(String word1, String word2) {
        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();
        return new updateBigChar(word1, word2);
    }

    private record updateBigChar(String word1, String word2) {
    }

    public int lengthCheck(String word1, String word2) {
        validCheck(word1, word2);
        if (isMatched(word1, word2)) {
            return LENGTH_MATCH_MAX_POINT;
        } else if (isDoubleSize(word1, word2)) {
            return DOUBLE_SIZE_ZERO_POINT;
        }
        return getPartialPoint(word1, word2);
    }

    private int getPartialPoint(String word1, String word2) {
        int gab =  Math.abs(word1.length() - word2.length());
        int shortLength = Math.min(word1.length(), word2.length());
        double ratio = (double) gab / shortLength;
        double result = (1 - ratio) * 60;
        return (int) result;
    }

    private boolean isDoubleSize(String word1, String word2) {
        return (word1.length() >= (word2.length() * 2)) || (word2.length() >= (word1.length() * 2));
    }

    private boolean isMatched(String word1, String word2) {
        return word1.length() == word2.length();
    }
}
