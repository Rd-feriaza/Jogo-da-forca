import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        List<String> listWords = Util.loadWords("palavras.txt");

        while (continuar) {
            System.out.println("=== JOGO DA FORCA ===");
            System.out.println("1. Jogar");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (choice) {
                case 1:
                    String wordsChosen = Util.ToChooseWordsRandom(listWords);
                    GameFromTheGallows game = new GameFromTheGallows(wordsChosen);
                    game.startGame();
                    break;

                case 2:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}