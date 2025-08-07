import java.util.*;

public class HangmanGame {

    private final Word word;
    private final Set<Character> lettersUsed = new HashSet<>();
    private int errors = 0;

    public HangmanGame(String secretWord) {
        this.word = new Word(secretWord);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (!word.isComplete() && errors < 6) {
            System.out.println("\nPalavra: " + word.getProgress());
            System.out.println("Letras usadas: " + lettersUsed);
            System.out.print("Digite uma letra: ");

            char letter = Character.toUpperCase(scanner.nextLine().charAt(0));

            if (lettersUsed.contains(letter)) {
                System.out.println("Você já usou essa letra. Tente outra.");
                continue;
            }

            lettersUsed.add(letter);

            if (!word.tryLetter(letter)) {
                System.out.println("Letra incorreta!");
                errors++;
            } else {
                System.out.println("Boa! Letra correta.");
            }

            drawHangman(errors);
        }

        if (word.isComplete()) {
            System.out.println("Parabéns! Você venceu! Palavra: " + word.getSecretWord());
        } else {
            System.out.println("Você perdeu. A palavra era: " + word.getSecretWord());
        }
    }

    private void drawHangman(int errors) {
        String[] Hangman = {
                "  -----",
                "  |   |",
                "  |   " + (errors > 0 ? "O" : ""),
                "  |  " + (errors > 2 ? "/" : " ") + (errors > 1 ? "|" : "") + (errors > 3 ? "\\" : ""),
                "  |  " + (errors > 4 ? "/" : "") + " " + (errors > 5 ? "\\" : ""),
                "  |",
                "======="
        };
        for (String line : Hangman) {
            System.out.println(line);
        }
    }
}
