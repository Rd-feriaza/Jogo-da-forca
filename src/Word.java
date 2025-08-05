public class Word {
    private final String wordSecret;
    private final char[] letterDiscoveries;

    public Word(String word) {
        this.wordSecret = word.toUpperCase();
        this.letterDiscoveries = new char[word.length()];
        for (int i = 0; i < letterDiscoveries.length; i++) {
            letterDiscoveries[i] = '_';
        }
    }

    public boolean ToTryLetter(char letter) {
        boolean GotItRight = false;
        for (int i = 0; i < wordSecret.length(); i++) {
            if (wordSecret.charAt(i) == letter) {
                letterDiscoveries[i] = letter;
                GotItRight = true;
            }
        }
        return GotItRight;
    }

    public boolean wordFull() {
        return wordSecret.equals(new String(letterDiscoveries));
    }

    public String getWordSecret() {
        return wordSecret;
    }

    public String getProgress() {
        return new String(letterDiscoveries);
    }
}

