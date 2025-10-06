import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textFileReader {
    public static void main(String[] args) {
        String fileName = "file.txt";  
        int lineCount = 0;
        int wordCount = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;  // count lines
                
                // Spliting the line into words based on spaces
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {  
                    wordCount += words.length;
                }
            }

            bufferedReader.close();

            System.out.println("File Name: " + fileName);
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e);
        }
    }
}
