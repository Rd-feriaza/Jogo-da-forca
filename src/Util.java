import java.io.*;
import java.util.*;

public class Util {

    public static List<String> loadWords(String pathFile) {
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    words.add(line.toUpperCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return words;
    }

    public static String ToChooseWordsRandom(List<String> list) {
        if (list.isEmpty()) {
            return "JAVA"; // palavra padrão se o arquivo estiver vazio
        }

        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}