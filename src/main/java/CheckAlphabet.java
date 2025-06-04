public class CheckAlphabet {
    public void validCheck(String word1, String word2) {
        if (word1 == null || word2 == null) {
            throw new  IllegalArgumentException();
        }
    }

    public int lengthCheck(String word1, String word2) {
        if (word1.length() == word2.length()) {
            return 60;
        }
        return 0;
    }
}
