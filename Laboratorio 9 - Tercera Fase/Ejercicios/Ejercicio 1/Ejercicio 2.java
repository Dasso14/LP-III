import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static void main(String[] args) {
        String filePath = "lear.txt";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            
            int lines = 0;
            int words = 0;
            int characters = 0;
            
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                words += countWords(line);
            }
            
            reader.close();

            System.out.println("Archivo: " + filePath);
            System.out.println("Lineas: " + lines);//6
            System.out.println("Palabras: " + words);//47
            System.out.println("Caracteres: " + characters);//248
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countWords(String line) {
        String[] words = line.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() > 0 && Character.isLetterOrDigit(word.charAt(0))) {
                count++;
            }
        }
        return count;
    }
}
