package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Contacts {
    public static void main (String [] args){
        newFile();
    }
    static void newFile(){
        String directory = "data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toAbsolutePath());
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
                System.out.println("created directory");
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
                System.out.println("created file");
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
