import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "/workspace/MTUSep24DSC/02. Java Collections Framework/Lab/hamlet.txt";

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println("''"+ word + lineNumber);
                }
                in.close(); 
                lineParser.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
