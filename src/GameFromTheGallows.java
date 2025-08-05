import java.util.*;

public class GameFromTheGallows {
    private final Word word;
    private final Gallows gallows;
    private final Set<Character> letterUsed;

    public GameFromTheGallows(String wordSecret) {
        this.word = new Word(wordSecret);
        this.gallows = new Gallows();
        this.letterUsed = new HashSet<>();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (!word.wordFull() && !gallows.isHanged()) {
            System.out.println("\nPalavra: " + word.getProgress());
            System.out.println("Letras usadas: " + letterUsed);
            System.out.print("Digite uma letra: ");
            char letter = Character.toUpperCase(scanner.next().charAt(0));

            if (letterUsed.contains(letter)) {
                System.out.println("Você já tentou essa letra, Escolha outra.");
                continue;
            }

            letterUsed.add(letter);

            if (!word.ToTryLetter(letter)) {
                System.out.println("Letra incorreta!");
                gallows.error();
            } else {
                System.out.println("Boa! Letra correta.");
            }

            gallows.showGallows();
        }

        if (word.wordFull()) {
            System.out.println("Parabéns! Você acertou: " + word.getWordSecret());
        } else {
            System.out.println("Você perdeu! A palavra era: " + word.getWordSecret());
        }
    }
}
