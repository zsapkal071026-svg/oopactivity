import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pr26 {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        if (args.length < 1) {
            System.out.println("Please provide file name");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}