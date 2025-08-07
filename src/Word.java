public class Word {
    private final String secretWord;
    private final char[] progress;

    public Word(String word) {
        this.secretWord = word;
        this.progress = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            progress[i] = '_';
        }
    }

    public boolean tryLetter(char letter) {
        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter) {
                progress[i] = letter;
                found = true;
            }
        }
        return found;
    }

    public boolean isComplete() {
        for (char c : progress) {
            if (c == '_') return false;
        }
        return true;
    }

    public String getProgress() {
        return new String(progress);
    }

    public String getSecretWord() {
        return secretWord;
    }
}
