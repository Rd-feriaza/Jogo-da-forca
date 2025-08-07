public class HangmanChar {
    private final char character;
    private final int position;

    public HangmanChar(char character, int position) {
        this.character = character;
        this.position = position;
    }

    public char getCharacter() {
        return character;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int newPosition) {
        // se quiser alterar a posição
    }
}
