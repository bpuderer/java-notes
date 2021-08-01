package javatutorial;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesEx {

    public static void main(String[] args) {

        // try-with-resources example
        try (Scanner scanner = new Scanner(Paths.get("test.properties"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Files.lines(Paths.get("test.properties")).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // TODO: writing PrintWriter, FileWriter

}